package ext.library.entity.tables;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;


public class UserDef extends TableDef {

    public static final UserDef user = new UserDef("user");

    public QueryColumn id = new QueryColumn(this, "id");
    public QueryColumn username = new QueryColumn(this, "username");
    public QueryColumn password = new QueryColumn(this, "password");
    public QueryColumn remark = new QueryColumn(this, "remark");
    public QueryColumn create_time = new QueryColumn(this, "create_time");
    public QueryColumn update_time = new QueryColumn(this, "update_time");
    public QueryColumn is_deleted = new QueryColumn(this, "is_deleted");

    public QueryColumn[] default_columns = new QueryColumn[]{ id, username, password, remark, create_time, update_time, is_deleted};
    public QueryColumn[] all_columns = new QueryColumn[]{ id, username, password, remark, create_time, update_time, is_deleted};

    public UserDef(String tableName) {
        super(tableName);
    }
}
