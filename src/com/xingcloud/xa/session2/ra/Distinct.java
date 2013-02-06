package com.xingcloud.xa.session2.ra;

/**
 * Author: mulisen
 * Date:   2/5/13
 * 根据输入的Column name，对relation去重。
 * 输出一个和输入的relation有同样列的去重后的relation。
 */
public interface Distinct extends Operation{
	void setInput(RelationProvider relation, String colName);
}