package com.dyzwj;

/**
 * 可计算任务
 * @param <V> 计算结果类型
 */
public abstract class Computable<V> implements Repeatable<V>{
    @Override
    public void execute(int repeatTimes) throws Exception {
        throw new IllegalAccessException("不支持的方法");
    }

    @Override
    public void execute(int repeatTimes, V receiveValue) throws Exception {
        throw new IllegalAccessException("不支持的方法");
    }
}



