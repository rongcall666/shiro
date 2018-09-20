package shiroweb.entity;

import java.util.List;

public class Roles {
	private Integer roleId;
	private String roleName;
	
	private List<Users> users;
	private List<Permissions> psermissions;
	
	
	public Roles() {
		super();
	}
	public Roles(Integer roleId, String roleName, List<Users> users, List<Permissions> psermissions) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.users = users;
		this.psermissions = psermissions;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public List<Permissions> getPsermissions() {
		return psermissions;
	}
	public void setPsermissions(List<Permissions> psermissions) {
		this.psermissions = psermissions;
	}
	
}
