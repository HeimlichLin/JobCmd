package idv.heimlich.JobCmd.common.dao;


public interface IConverter<Po> {

	Po convert(RowMap paramDataObject);
	
	RowMap toRowMap(Po po);

}
