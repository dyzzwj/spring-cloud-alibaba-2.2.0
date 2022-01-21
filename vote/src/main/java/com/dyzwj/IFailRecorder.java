package com.dyzwj;

/**
 * 失败记录器
 *   让使用者可以自己实现任务执行失败的日志记录，比如持久化磁盘或是发送到远程服务器，避免任务丢失，是保持事务一致性的兜底方案之一，设置成缺省方法使得使用者有选择地实现，不强制一定要有失败处理方案。
 *
 */
interface IFailRecorder {
    /**
     * 记录每次重试的失败情况
     * @param attemptTimes 重试次数，第一次重试=0
     * @param e 导致失败的异常
     */
    default void recordFail(int attemptTimes, Exception e){}

    /**
     * 记录每次重试的失败情况
     * @param attemptTimes 重试次数，第一次重试=0
     */
    default void recordFail(int attemptTimes){}

    /**
     * 记录重试之后的最终失败
     * @param e 导致失败的异常，如果没有异常，返回null
     */
    default void recordEnd(Exception e){}
}

