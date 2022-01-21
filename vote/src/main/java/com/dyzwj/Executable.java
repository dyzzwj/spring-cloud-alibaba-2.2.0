package com.dyzwj;

/**
 * 可执行任务
 */
public abstract class Executable<V> implements Repeatable<V>{
    @Override
    public V compute(int repeatTimes) throws Exception {
        throw new IllegalAccessException("不支持的方法");
    }
}