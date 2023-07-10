package com.ikm.filemanagement.model;



import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
    public class EmployeeDAO {

        private final JdbcTemplate jdbcTemplate;
        private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

        public EmployeeDAO(DataSource dataSource) {
            this.jdbcTemplate = new JdbcTemplate(dataSource);
            this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        }

        public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
            String sql = "INSERT INTO employees (emp_id, name, pen_no, phone, date_of_birth) " +
                    "VALUES (:empId, :name, :penNo, :phone, :dateOfBirth)";

            SqlParameterSource params = new MapSqlParameterSource()
                    .addValue("empId", employeeDTO.getEmpId())
                    .addValue("name", employeeDTO.getName())
                    .addValue("penNo", employeeDTO.getPenNo())
                    .addValue("phone", employeeDTO.getPhone())
                    .addValue("dateOfBirth", employeeDTO.getDateOfBirth());

            namedParameterJdbcTemplate.update(sql, params);

            return employeeDTO;
        }
    }


