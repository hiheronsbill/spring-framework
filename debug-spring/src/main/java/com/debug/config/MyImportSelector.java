package com.debug.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/**
 * 自定义逻辑返回需要导入的组件
 */
public class MyImportSelector implements ImportSelector {

	/**
	 * @param importingClassMetadata：当前标注@import注解的类的所有注解信息
	 * @return 返回值就是需要导入组件的全类名
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.debug.entity.Blue"};
	}

}
