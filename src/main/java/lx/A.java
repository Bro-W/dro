package lx;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 王国梁
 * @date 2023/3/29 15:36
 */
public class A implements FactoryBean <B> {
    @Override
    public B getObject() throws Exception {
        B b = new B();
        b.setName("B的名字！");
        return b;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
