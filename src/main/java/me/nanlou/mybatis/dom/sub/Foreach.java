package me.nanlou.mybatis.dom.sub;// Generated on Sun Aug 12 04:02:15 CST 2018
// DTD/Schema  :    null


import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:foreachElemType interface.
 * @author me
 */
public interface Foreach extends DomElement {

	/**
	 * Returns the value of the simple content.
	 * @return the value of the simple content.
	 */
	@NotNull
	@Required
	String getValue();
	/**
	 * Sets the value of the simple content.
	 * @param value the new value to set
	 */
	void setValue(@NotNull String value);


	/**
	 * Returns the value of the collection child.
	 * @return the value of the collection child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getCollection();


	/**
	 * Returns the value of the item child.
	 * @return the value of the item child.
	 */
	@NotNull
	GenericAttributeValue<String> getItem();


	/**
	 * Returns the value of the index child.
	 * @return the value of the index child.
	 */
	@NotNull
	GenericAttributeValue<String> getIndex();


	/**
	 * Returns the value of the open child.
	 * @return the value of the open child.
	 */
	@NotNull
	GenericAttributeValue<String> getOpen();


	/**
	 * Returns the value of the close child.
	 * @return the value of the close child.
	 */
	@NotNull
	GenericAttributeValue<String> getClose();


	/**
	 * Returns the value of the separator child.
	 * @return the value of the separator child.
	 */
	@NotNull
	GenericAttributeValue<String> getSeparator();


	/**
	 * Returns the list of include children.
	 * @return the list of include children.
	 */
	@NotNull
	List<Include> getIncludes();
	/**
	 * Adds new child to the list of include children.
	 * @return created child
	 */
	Include addInclude();


	/**
	 * Returns the list of trim children.
	 * @return the list of trim children.
	 */
	@NotNull
	List<Trim> getTrims();
	/**
	 * Adds new child to the list of trim children.
	 * @return created child
	 */
	Trim addTrim();


	/**
	 * Returns the list of where children.
	 * @return the list of where children.
	 */
	@NotNull
	List<GenericDomValue<String>> getWheres();
	/**
	 * Adds new child to the list of where children.
	 * @return created child
	 */
	GenericDomValue<String> addWhere();


	/**
	 * Returns the list of set children.
	 * @return the list of set children.
	 */
	@NotNull
	List<GenericDomValue<String>> getSets();
	/**
	 * Adds new child to the list of set children.
	 * @return created child
	 */
	GenericDomValue<String> addSet();


	/**
	 * Returns the list of foreach children.
	 * @return the list of foreach children.
	 */
	@NotNull
	List<Foreach> getForeaches();
	/**
	 * Adds new child to the list of foreach children.
	 * @return created child
	 */
	Foreach addForeach();


	/**
	 * Returns the list of choose children.
	 * @return the list of choose children.
	 */
	@NotNull
	List<Choose> getChooses();
	/**
	 * Adds new child to the list of choose children.
	 * @return created child
	 */
	Choose addChoose();


	/**
	 * Returns the list of if children.
	 * @return the list of if children.
	 */
	@NotNull
	List<If> getIfs();
	/**
	 * Adds new child to the list of if children.
	 * @return created child
	 */
	If addIf();


	/**
	 * Returns the list of bind children.
	 * @return the list of bind children.
	 */
	@NotNull
	List<Bind> getBinds();
	/**
	 * Adds new child to the list of bind children.
	 * @return created child
	 */
	Bind addBind();


}
