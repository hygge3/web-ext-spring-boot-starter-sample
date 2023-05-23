package ext.library.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class Tables {


    public static final UserTableDef USER = new UserTableDef("user");

    public static class UserTableDef extends TableDef {

        public QueryColumn ID = new QueryColumn(this, "id");
        public QueryColumn USERNAME = new QueryColumn(this, "username");
        public QueryColumn PASSWORD = new QueryColumn(this, "password");
        public QueryColumn REMARK = new QueryColumn(this, "remark");
        public QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");
        public QueryColumn UPDATE_TIME = new QueryColumn(this, "update_time");
        public QueryColumn IS_DELETED = new QueryColumn(this, "is_deleted");

        public QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, USERNAME, PASSWORD, CREATE_TIME, UPDATE_TIME};
        public QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");


        public UserTableDef(String tableName) {
            super(tableName);
        }
    }
}
