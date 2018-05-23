package cn.lt.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOGIN_HISTORY_ENTITY".
*/
public class LoginHistoryEntityDao extends AbstractDao<LoginHistoryEntity, Long> {

    public static final String TABLENAME = "LOGIN_HISTORY_ENTITY";

    /**
     * Properties of entity LoginHistoryEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Avatar = new Property(1, String.class, "avatar", false, "AVATAR");
        public final static Property Mobile = new Property(2, String.class, "mobile", false, "MOBILE");
        public final static Property Email = new Property(3, String.class, "email", false, "EMAIL");
        public final static Property Token = new Property(4, String.class, "token", false, "TOKEN");
        public final static Property UserId = new Property(5, Long.class, "userId", false, "USER_ID");
        public final static Property NickName = new Property(6, String.class, "nickName", false, "NICK_NAME");
    };


    public LoginHistoryEntityDao(DaoConfig config) {
        super(config);
    }
    
    public LoginHistoryEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOGIN_HISTORY_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"AVATAR\" TEXT," + // 1: avatar
                "\"MOBILE\" TEXT," + // 2: mobile
                "\"EMAIL\" TEXT," + // 3: email
                "\"TOKEN\" TEXT," + // 4: token
                "\"USER_ID\" INTEGER," + // 5: userId
                "\"NICK_NAME\" TEXT);"); // 6: nickName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOGIN_HISTORY_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, LoginHistoryEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(2, avatar);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(3, mobile);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(4, email);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(5, token);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(6, userId);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(7, nickName);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public LoginHistoryEntity readEntity(Cursor cursor, int offset) {
        LoginHistoryEntity entity = new LoginHistoryEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // avatar
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // mobile
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // email
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // token
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // userId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // nickName
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, LoginHistoryEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAvatar(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMobile(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEmail(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setToken(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUserId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setNickName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(LoginHistoryEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(LoginHistoryEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
