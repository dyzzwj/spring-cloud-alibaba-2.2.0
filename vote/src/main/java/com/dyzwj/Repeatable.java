package com.dyzwj;

/**
 * 定义执行的基本单元，代表需要执行一个redis操作或是发送MQ操作，接口方法可能会由调度器重复地执行，所以要求接口实现者自身保证幂等性。
 */
public interface Repeatable<V> extends IFailRecorder{
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @param repeatTimes repeat times, first repeatTimes is 0
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    V compute(int repeatTimes) throws Exception;

    /**
     * Execute with no result, and throws an exception if unable to do so.
     *
     * @param repeatTimes repeat times, first repeatTimes is 0
     * @param receiveValue last step computed result
     * @throws Exception if unable to compute a result
     */
    default void execute(int repeatTimes, V receiveValue) throws Exception{}

    /**
     * Execute with no result, and throws an exception if unable to do so.
     *
     * @param repeatTimes repeat times, first repeatTimes is 0
     * @throws Exception if unable to compute a result
     */
    default void execute(int repeatTimes) throws Exception{}
}
