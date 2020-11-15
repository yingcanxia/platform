package com.experimental.config;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.*;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class TxAnoConfig {

    @Autowired
    private DataSource dataSource;

    @Bean("txManager")
    public DataSourceTransactionManager txManager(){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean("txAdvice")
    public TransactionInterceptor txAdvice(DataSourceTransactionManager txManager){

        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
        /*只读事务，不做更新操作*/
        RuleBasedTransactionAttribute readOnlyTx = new RuleBasedTransactionAttribute();
        readOnlyTx.setReadOnly(true);
        readOnlyTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED );
        /*当前存在事务就使用当前事务，当前不存在事务就创建一个新的事务*/
        //RuleBasedTransactionAttribute requiredTx = new RuleBasedTransactionAttribute();
        //requiredTx.setRollbackRules(
        //    Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        //requiredTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        RuleBasedTransactionAttribute requiredTx = new RuleBasedTransactionAttribute(TransactionDefinition.PROPAGATION_REQUIRED,
                Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        requiredTx.setTimeout(5);
        Map<String, TransactionAttribute> txMap = new HashMap<>();
        txMap.put("add*", requiredTx);
        txMap.put("save*", requiredTx);
        txMap.put("insert*", requiredTx);
        txMap.put("update*", requiredTx);
        txMap.put("delete*", requiredTx);
        txMap.put("get*", readOnlyTx);
        txMap.put("query*", readOnlyTx);
        source.setNameMap( txMap );
        return new TransactionInterceptor(txManager ,source) ;
    }

    /**切面拦截规则 参数会自动从容器中注入*/
    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor(TransactionInterceptor txAdvice){
        DefaultPointcutAdvisor pointcutAdvisor = new DefaultPointcutAdvisor();
        pointcutAdvisor.setAdvice(txAdvice);
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution (* com.test.service.*.*(..))");
        pointcutAdvisor.setPointcut(pointcut);
        return pointcutAdvisor;
    }
   /* @Bean
    public TransactionInterceptor TxAdvice() {
        // 事务管理规则，承载需要进行事务管理的方法名（模糊匹配）及设置的事务管理属性
        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();

        // 设置第一个事务管理的模式（适用于“增删改”）
        RuleBasedTransactionAttribute transactionAttribute1 = new RuleBasedTransactionAttribute();
        // 当抛出设置的对应异常后，进行事务回滚（此处设置为“Exception”级别）
        transactionAttribute1.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        // 设置隔离级别（存在事务则加入其中，不存在则新建事务）
        transactionAttribute1.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        // 设置传播行为（读已提交的数据）
        transactionAttribute1.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);

        // 设置第二个事务管理的模式（适用于“查”）
        RuleBasedTransactionAttribute transactionAttribute2 = new RuleBasedTransactionAttribute();
        // 当抛出设置的对应异常后，进行事务回滚（此处设置为“Exception”级别）
        transactionAttribute2.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        // 设置隔离级别（存在事务则挂起该事务，执行当前逻辑，结束后再恢复上下文事务）
        transactionAttribute2.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);
        // 设置传播行为（读已提交的数据）
        transactionAttribute2.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        // 设置事务是否“只读”（非必需，只是声明该事务中不会进行修改数据库的操作，可减轻由事务造成的数据库压力，属于性能优化的推荐配置）
        transactionAttribute2.setReadOnly(true);

        // 建立一个map，用来储存要需要进行事务管理的方法名（模糊匹配）
        Map<String, TransactionAttribute> txMap = new HashMap<>();
        txMap.put("insert*", transactionAttribute1);
        txMap.put("update*", transactionAttribute1);
        txMap.put("delete*", transactionAttribute1);
        txMap.put("query*", transactionAttribute2);

        // 注入设置好的map
        source.setNameMap(txMap);
        // 实例化事务拦截器
        TransactionInterceptor txAdvice = new TransactionInterceptor(transactionManager, source);
        return txAdvice;
    }*/




}
