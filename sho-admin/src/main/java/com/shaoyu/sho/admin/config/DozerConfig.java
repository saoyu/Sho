package com.shaoyu.sho.admin.config;

import com.shaoyu.sho.admin.model.dataobject.SysUser;
import com.shaoyu.sho.admin.model.query.UserQuery;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ByteOO
 * Date: 2020/7/6 18:32
 * @Version:
 * @Description:
 */
@Configuration
public class DozerConfig {
	@Bean
	public Mapper dozerMapper() {
		Mapper mapper = DozerBeanMapperBuilder.create()
				.withMappingBuilder(beanMappingBuilder())
				.build();
		return mapper;
	}

	@Bean
	public BeanMappingBuilder beanMappingBuilder() {
		return new BeanMappingBuilder() {
			@Override
			protected void configure() {
				mapping(SysUser.class, UserQuery.class).exclude("password");
			}
		};
	}
}