package com.ikm.filemanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeDTO {
      @Id
        private int empId;

        private String name;
        private String penNo;
        private String phone;
        private Date dateOfBirth;


        public EmployeeDTO(int empId, String name, String penNo, String phone, Date dateOfBirth) {
            this.empId = empId;
            this.name = name;
            this.penNo = penNo;
            this.phone = phone;
            this.dateOfBirth = dateOfBirth;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPenNo() {
            return penNo;
        }

        public void setPenNo(String penNo) {
            this.penNo = penNo;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Date getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }

