import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.ArrayList;

public interface DBInterface {
    public List<List<String>> getCourses(int tag) throws SQLException;	//改

    public List<String> getCourse(int id) throws SQLException;
    public List<List<String>> getCourseAppraises(int id) throws SQLException;
    public boolean addAppraise(int id, int teacher, int sweet,
        int rich, String appraise, String username) throws SQLException;

    public List<List<String>> getBooks(int tag) throws SQLException;		//改
    public List<String> getBook(long id) throws SQLException;			//改
    public boolean addBook(long id, String name, int price,			//改
        String describe, int tag, String username) throws SQLException;	//改

    public List<List<String>> getStuffs(int tag) throws SQLException;	//改	
    public List<String> getStuff(long id) throws SQLException;			//改
    public boolean addStuff(long id, String name, int price,			//改
        String describe, int tag, String username) throws SQLException;	//改

    public List<List<String>> getGossips() throws SQLException;
    public boolean addGossip(long id, String title, String content,		//改
        String username) throws SQLException;

    public List<String> getGossip(long id) throws SQLException;			//改
    public List<List<String>> getGossipReply(long id) throws SQLException;	//改
    public boolean addGossipReply(long id, String content,			//改
        String username) throws SQLException;	

    public boolean addUser(String email, String Username,
        String Password) throws SQLException;
    public boolean verifyUser(String Username, String Password) throws SQLException;
}