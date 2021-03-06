package com.ygt.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{//Dept(Entity) orm mysql->Dept(table)类表关系映射
	  //Dept(Entity) orm mysql->Dept(table)类表关系映射
	private Long  deptno;   //主键	@SuppressWarnings("unused")
	private String  dname;   //部门名称	  @SuppressWarnings("unused")
	private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	  
	  public Dept(String dname)
	  {
	   super();
	   this.dname = dname;
	  }  

}
