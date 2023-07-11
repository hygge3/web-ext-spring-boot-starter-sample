package ext.library.entity.tables;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

/**
 *  表定义层。
 *
 * @author Mybatis-Flex Codegen
 * @since 2023-07-11
 */
public class UserTableDef extends TableDef {

    public static final UserTableDef USER = new UserTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");
    public final QueryColumn NAME = new QueryColumn(this, "name");
    public final QueryColumn GENDER = new QueryColumn(this, "gender");
    public final QueryColumn BIRTH_DATE = new QueryColumn(this, "birth_date");
    public final QueryColumn PHONE = new QueryColumn(this, "phone");
    public final QueryColumn REMARK = new QueryColumn(this, "remark");
    public final QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");
    public final QueryColumn UPDATE_TIME = new QueryColumn(this, "update_time");
    public final QueryColumn DELETE_TIME = new QueryColumn(this, "delete_time");

    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NAME, GENDER, BIRTH_DATE, PHONE, CREATE_TIME, UPDATE_TIME, };

    public UserTableDef() {
        super("", "t_user");
    }

}
