 package com.zaq.core.vo;
 
 import com.google.gson.annotations.Expose;
 /**
  * 部门bean
  * @author zaq
  *
  */
 public class Department
 {
 
   @Expose
   private Long depId;
 
   @Expose
   private String depName;
 
   @Expose
   private String depDesc;
 
   @Expose
   private Integer depLevel;
 
   @Expose
   private Long parentId;
 
   @Expose
   private String path;
 
   public Department()
   {
   }
 
   public Department(Long depId)
   {
     setDepId(depId);
   }
 
   public Long getDepId() {
     return this.depId;
   }
 
   public void setDepId(Long depId) {
     this.depId = depId;
   }
 
   public String getDepName() {
     return this.depName;
   }
 
   public void setDepName(String depName) {
     this.depName = depName;
   }
 
   public String getDepDesc() {
     return this.depDesc;
   }
 
   public void setDepDesc(String depDesc) {
     this.depDesc = depDesc;
   }
 
   public Integer getDepLevel() {
     return this.depLevel;
   }
 
   public void setDepLevel(Integer depLevel) {
     this.depLevel = depLevel;
   }
 
   public Long getParentId() {
     return this.parentId;
   }
 
   public void setParentId(Long parentId) {
     this.parentId = parentId;
   }
 
   public String getPath() {
     return this.path;
   }
 
   public void setPath(String path) {
     this.path = path;
   }
 }

