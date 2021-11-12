package com.example.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeInfoImpl implements IEmployeeInfo {

//	@Autowired
//	//@Qualifier("spring.db1.datasource")
//	DataSource dataSource;
//	
	@Value("${spring.db1.datasource.url}")
	String DB_URL;
	@Value("${spring.db1.datasource.username}")
	String USER;
	@Value("${spring.db1.datasource.password}")
	String PASS;
	
//	@PostConstruct
//	void init() {
//		//getJdbcTemplate().setFetchSize(500);
//		//setDataSource(dataSource);
//		//getJdbcTemplate().setFetchSize(500);
//
//	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM " + "\"EmployeeInfo\"";
		return getAll(sql);
	}

	@Override
	public Employee getEmployeebyId(String employeeId) {
		String sql = "SELECT * FROM " + "\"EmployeeInfo\""+" where employeeid='"+employeeId+"'";
		return getAll(sql).get(0);
	}
	
//	private List<Employee> getEmployees(String sql) {
//		return getJdbcTemplate().query(sql, new RowMapper<Employee>() {
//
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Employee employee = new Employee();
//				employee.setEmployeename(rs.getString("employeename"));
//				employee.setEmployeeid(rs.getString("employeeid"));
//				employee.setProjectname(rs.getString("projectname"));
//				employee.setDepartment(rs.getString("department"));
//				employee.setCity(rs.getString("city"));
//				employee.setAddress(rs.getString("address"));
////				areaIOInfo.setTagid(rs.getString("tagid"));
////				areaIOInfo.setAreaid(rs.getString("areaid"));
////				areaIOInfo.setStorename(rs.getString("storename"));
////				areaIOInfo.setAreaname(rs.getString("areaname"));
////
////				areaIOInfo.setInOutClassification(rs.getInt("inoutclassification"));
////				// areaIOInfo.setInOutClassification(rs.getInt("\"inOutClassification\""));
////				areaIOInfo.setTimeStamp(rs.getString("timestamp"));
////				// areaIOInfo.setTimeStamp(rs.getString("\"timeStamp\""));
////				areaIOInfo.setEdgeId(rs.getString("edge_id"));
////				areaIOInfo.setSetNo(rs.getString("setNo"));
//				// areaIOInfo.setSetNo(rs.getString("\"setNo\""));
//				return employee;
//			}
//
//		});
//	}
//	
	
	private List<Employee> getAll(String sql) {
		List<Employee> emploList = new ArrayList<Employee>();
		ResultSet rs;
		Statement stmt = null;
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString());

			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEmployeename(rs.getString("employeename"));
				employee.setEmployeeid(rs.getString("employeeid"));
				employee.setProjectname(rs.getString("projectname"));
				employee.setDepartment(rs.getString("department"));
				employee.setCity(rs.getString("city"));
				employee.setAddress(rs.getString("address"));
				emploList.add(employee);
			}
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		}
		return emploList;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Employee> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Employee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Employee> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Employee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
	}


