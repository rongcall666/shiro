package shiroweb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import shiroweb.entity.Roles;
import shiroweb.entity.Users;

public interface UsersDao {

	@Select("select id,password,name from users where id = #{id}")
	public Users findById(Integer id);

	@Select("select r.role_id,r.role_name from roles r,user_role ur,users u "
			+ "where u.id = ur.user_id and r.role_id = ur.role_id"
			+ "and u.id = #{id}")
	public List<Roles> findRolesById(Integer id);
}
