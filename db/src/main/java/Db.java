import java.util.UUID;

public class Db {
    private DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        myEntity = new MyEntity("первая");
        myEntity.setId(UUID.randomUUID());
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }
}
