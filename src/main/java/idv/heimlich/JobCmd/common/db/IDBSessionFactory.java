package idv.heimlich.JobCmd.common.db;

public interface IDBSessionFactory {

	IDBSession getXdaoSession(String conn);

}
