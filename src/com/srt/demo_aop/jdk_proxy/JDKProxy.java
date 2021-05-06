package com.srt.demo_aop.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {

        //创建接口实现类代理对象
        Class[] interfaces={UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });

        UserDaoImpl userDao=new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println(result);
    }
}


//创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    //1.代理对象被创建者传过来
    //有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }

    //写增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法执行之前．．"+method.getName()+"：传递的参数．．"+ Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj, args);


        //方法之后
        System.out.println("方法执行之后．．"+obj);


        return res;
    }
}

