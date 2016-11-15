package helloWorld.mybatis.bean;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

	// ****** 查询用户 ******
	public User selectUser(String userID);

	@Select("select * from user where userID = #{userID}")
	public User selectUser2(String userID);

	@Select("select * from user where user_name like \"%#{name}%\"")
	public List<User> fuzzyQuery(String name);

	// ****** 查询所有用户 ******
	public List<User> selectAll();

	// ****** 插入用户 ******
	public int insertUser(User user);

	@Insert("insert into user(name,age,sex,remark) values(#{name},#{age},#{sex},#{remark})")
	public int insertUser2(User user);

	// ******* 修改用户 *******
	@Update("update user set name=#{name} where userID=#{userID}")
	public int updateUser(User user);

	// ******* 删除 *******
	@Update("delete from user where userID = #{userID}")
	public int deleteUser(int userID);

	// ******* 批量插入 *******
	public int insertBatch(List<User> list);

}
