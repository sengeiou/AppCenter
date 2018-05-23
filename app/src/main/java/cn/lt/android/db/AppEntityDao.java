package cn.lt.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "APP_ENTITY".
*/
public class AppEntityDao extends AbstractDao<AppEntity, Long> {

    public static final String TABLENAME = "APP_ENTITY";

    /**
     * Properties of entity AppEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property PackageName = new Property(1, String.class, "packageName", false, "PACKAGE_NAME");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Alias = new Property(3, String.class, "alias", false, "ALIAS");
        public final static Property DownloadUrl = new Property(4, String.class, "downloadUrl", false, "DOWNLOAD_URL");
        public final static Property SavePath = new Property(5, String.class, "savePath", false, "SAVE_PATH");
        public final static Property IconUrl = new Property(6, String.class, "iconUrl", false, "ICON_URL");
        public final static Property PackageSize = new Property(7, String.class, "packageSize", false, "PACKAGE_SIZE");
        public final static Property Apps_type = new Property(8, String.class, "apps_type", false, "APPS_TYPE");
        public final static Property Apps_startDownloadTime = new Property(9, Long.class, "apps_startDownloadTime", false, "APPS_START_DOWNLOAD_TIME");
        public final static Property Apps_endDownloadTime = new Property(10, Long.class, "apps_endDownloadTime", false, "APPS_END_DOWNLOAD_TIME");
        public final static Property Lackofmemory = new Property(11, Boolean.class, "lackofmemory", false, "LACKOFMEMORY");
        public final static Property Package_md5 = new Property(12, String.class, "package_md5", false, "PACKAGE_MD5");
        public final static Property Version_code = new Property(13, String.class, "version_code", false, "VERSION_CODE");
        public final static Property Version_name = new Property(14, String.class, "version_name", false, "VERSION_NAME");
        public final static Property Corner_url = new Property(15, String.class, "corner_url", false, "CORNER_URL");
        public final static Property Reviews = new Property(16, String.class, "reviews", false, "REVIEWS");
        public final static Property Created_at = new Property(17, String.class, "created_at", false, "CREATED_AT");
        public final static Property Download_count = new Property(18, String.class, "download_count", false, "DOWNLOAD_COUNT");
        public final static Property Description = new Property(19, String.class, "description", false, "DESCRIPTION");
        public final static Property Category = new Property(20, String.class, "category", false, "CATEGORY");
        public final static Property IsAD = new Property(21, Boolean.class, "isAD", false, "IS_AD");
        public final static Property IsOrderWifiDownload = new Property(22, Boolean.class, "isOrderWifiDownload", false, "IS_ORDER_WIFI_DOWNLOAD");
        public final static Property IsAppAutoUpgrade = new Property(23, Boolean.class, "isAppAutoUpgrade", false, "IS_APP_AUTO_UPGRADE");
        public final static Property CanReplace = new Property(24, Boolean.class, "canReplace", false, "CAN_REPLACE");
        public final static Property AdMold = new Property(25, String.class, "adMold", false, "AD_MOLD");
        public final static Property ReportType = new Property(26, String.class, "reportType", false, "REPORT_TYPE");
        public final static Property ReportData = new Property(27, String.class, "reportData", false, "REPORT_DATA");
        public final static Property ErrorType = new Property(28, Long.class, "errorType", false, "ERROR_TYPE");
    };


    public AppEntityDao(DaoConfig config) {
        super(config);
    }
    
    public AppEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"APP_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PACKAGE_NAME\" TEXT," + // 1: packageName
                "\"NAME\" TEXT," + // 2: name
                "\"ALIAS\" TEXT," + // 3: alias
                "\"DOWNLOAD_URL\" TEXT," + // 4: downloadUrl
                "\"SAVE_PATH\" TEXT," + // 5: savePath
                "\"ICON_URL\" TEXT," + // 6: iconUrl
                "\"PACKAGE_SIZE\" TEXT," + // 7: packageSize
                "\"APPS_TYPE\" TEXT," + // 8: apps_type
                "\"APPS_START_DOWNLOAD_TIME\" INTEGER," + // 9: apps_startDownloadTime
                "\"APPS_END_DOWNLOAD_TIME\" INTEGER," + // 10: apps_endDownloadTime
                "\"LACKOFMEMORY\" INTEGER," + // 11: lackofmemory
                "\"PACKAGE_MD5\" TEXT," + // 12: package_md5
                "\"VERSION_CODE\" TEXT," + // 13: version_code
                "\"VERSION_NAME\" TEXT," + // 14: version_name
                "\"CORNER_URL\" TEXT," + // 15: corner_url
                "\"REVIEWS\" TEXT," + // 16: reviews
                "\"CREATED_AT\" TEXT," + // 17: created_at
                "\"DOWNLOAD_COUNT\" TEXT," + // 18: download_count
                "\"DESCRIPTION\" TEXT," + // 19: description
                "\"CATEGORY\" TEXT," + // 20: category
                "\"IS_AD\" INTEGER," + // 21: isAD
                "\"IS_ORDER_WIFI_DOWNLOAD\" INTEGER," + // 22: isOrderWifiDownload
                "\"IS_APP_AUTO_UPGRADE\" INTEGER," + // 23: isAppAutoUpgrade
                "\"CAN_REPLACE\" INTEGER," + // 24: canReplace
                "\"AD_MOLD\" TEXT," + // 25: adMold
                "\"REPORT_TYPE\" TEXT," + // 26: reportType
                "\"REPORT_DATA\" TEXT," + // 27: reportData
                "\"ERROR_TYPE\" INTEGER);"); // 28: errorType
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"APP_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AppEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String packageName = entity.getPackageName();
        if (packageName != null) {
            stmt.bindString(2, packageName);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String alias = entity.getAlias();
        if (alias != null) {
            stmt.bindString(4, alias);
        }
 
        String downloadUrl = entity.getDownloadUrl();
        if (downloadUrl != null) {
            stmt.bindString(5, downloadUrl);
        }
 
        String savePath = entity.getSavePath();
        if (savePath != null) {
            stmt.bindString(6, savePath);
        }
 
        String iconUrl = entity.getIconUrl();
        if (iconUrl != null) {
            stmt.bindString(7, iconUrl);
        }
 
        String packageSize = entity.getPackageSize();
        if (packageSize != null) {
            stmt.bindString(8, packageSize);
        }
 
        String apps_type = entity.getApps_type();
        if (apps_type != null) {
            stmt.bindString(9, apps_type);
        }
 
        Long apps_startDownloadTime = entity.getApps_startDownloadTime();
        if (apps_startDownloadTime != null) {
            stmt.bindLong(10, apps_startDownloadTime);
        }
 
        Long apps_endDownloadTime = entity.getApps_endDownloadTime();
        if (apps_endDownloadTime != null) {
            stmt.bindLong(11, apps_endDownloadTime);
        }
 
        Boolean lackofmemory = entity.getLackofmemory();
        if (lackofmemory != null) {
            stmt.bindLong(12, lackofmemory ? 1L: 0L);
        }
 
        String package_md5 = entity.getPackage_md5();
        if (package_md5 != null) {
            stmt.bindString(13, package_md5);
        }
 
        String version_code = entity.getVersion_code();
        if (version_code != null) {
            stmt.bindString(14, version_code);
        }
 
        String version_name = entity.getVersion_name();
        if (version_name != null) {
            stmt.bindString(15, version_name);
        }
 
        String corner_url = entity.getCorner_url();
        if (corner_url != null) {
            stmt.bindString(16, corner_url);
        }
 
        String reviews = entity.getReviews();
        if (reviews != null) {
            stmt.bindString(17, reviews);
        }
 
        String created_at = entity.getCreated_at();
        if (created_at != null) {
            stmt.bindString(18, created_at);
        }
 
        String download_count = entity.getDownload_count();
        if (download_count != null) {
            stmt.bindString(19, download_count);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(20, description);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(21, category);
        }
 
        Boolean isAD = entity.getIsAD();
        if (isAD != null) {
            stmt.bindLong(22, isAD ? 1L: 0L);
        }
 
        Boolean isOrderWifiDownload = entity.getIsOrderWifiDownload();
        if (isOrderWifiDownload != null) {
            stmt.bindLong(23, isOrderWifiDownload ? 1L: 0L);
        }
 
        Boolean isAppAutoUpgrade = entity.getIsAppAutoUpgrade();
        if (isAppAutoUpgrade != null) {
            stmt.bindLong(24, isAppAutoUpgrade ? 1L: 0L);
        }
 
        Boolean canReplace = entity.canReplace();
        if (canReplace != null) {
            stmt.bindLong(25, canReplace ? 1L: 0L);
        }
 
        String adMold = entity.getAdMold();
        if (adMold != null) {
            stmt.bindString(26, adMold);
        }
 
//        String reportType = entity.getReportType();
//        if (reportType != null) {
//            stmt.bindString(27, reportType);
//        }
 
        String reportData = entity.getReportData();
        if (reportData != null) {
            stmt.bindString(28, reportData);
        }

        Long errorType = entity.getErrorType();
        if (errorType != null) {
            stmt.bindLong(29, errorType);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AppEntity readEntity(Cursor cursor, int offset) {
        AppEntity entity = new AppEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // packageName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // alias
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // downloadUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // savePath
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // iconUrl
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // packageSize
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // apps_type
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // apps_startDownloadTime
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // apps_endDownloadTime
            cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0, // lackofmemory
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // package_md5
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // version_code
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // version_name
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // corner_url
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // reviews
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // created_at
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // download_count
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // description
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // category
            cursor.isNull(offset + 21) ? false : cursor.getShort(offset + 21) != 0, // isAD
            cursor.isNull(offset + 22) ? false : cursor.getShort(offset + 22) != 0, // isOrderWifiDownload
            cursor.isNull(offset + 23) ? false : cursor.getShort(offset + 23) != 0,// isAppAutoUpgrade
            cursor.isNull(offset + 24) ? false : cursor.getShort(offset + 24) != 0, // canReplace
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // adMold
//            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // reportType
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // reportData
                cursor.isNull(offset + 28) ? null : cursor.getLong(offset + 28) // errorType
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AppEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPackageName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAlias(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDownloadUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSavePath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIconUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPackageSize(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setApps_type(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setApps_startDownloadTime(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setApps_endDownloadTime(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setLackofmemory(cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0);
        entity.setPackage_md5(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setVersion_code(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setVersion_name(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCorner_url(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setReviews(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setCreated_at(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setDownload_count(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setDescription(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setCategory(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setIsAD(cursor.isNull(offset + 21) ? false : cursor.getShort(offset + 21) != 0);
        entity.setIsOrderWifiDownload(cursor.isNull(offset + 22) ? false : cursor.getShort(offset + 22) != 0);
        entity.setIsAppAutoUpgrade(cursor.isNull(offset + 23) ? false : cursor.getShort(offset + 23) != 0);
        entity.setCanReplace(cursor.isNull(offset + 24) ? false : cursor.getShort(offset + 24) != 0);
        entity.setAdMold(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
//        entity.setReportType(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setReportData(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setErrorType(cursor.isNull(offset + 28) ? null : cursor.getLong(offset + 28));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AppEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AppEntity entity) {
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
