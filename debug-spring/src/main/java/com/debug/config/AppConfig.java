package com.debug.config;

import com.debug.aop.AopAspect;
import com.debug.entity.Red;
import com.debug.entity.TestBean;
import com.debug.service.CalMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * @author zhxy
 * @date 2021/3/30 - 10:43 下午
 */

//@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.debug")
//@PropertySource("classpath:app.properties")
//@Import({Red.class,MyImportSelector.class,MyImportBeanDefinitionRegistry.class})
//@Import(MyImportBeanDefinitionRegistry.class)
public class AppConfig {

//	@Autowired
//	private Environment environment;


//	@Bean
//	public TestBean testBean(){
//
//		TestBean testBean = new TestBean();
//		testBean.setName(environment.getProperty("testBean.name"));
//		return testBean;
//	}


	@Bean
	public CalMath calMath(){
		return new CalMath();
	}
//
//
//	@Bean
//	public AopAspect aopAspect(){
//		return new AopAspect();
//	}

}
