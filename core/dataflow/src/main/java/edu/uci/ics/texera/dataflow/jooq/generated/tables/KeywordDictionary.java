/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.dataflow.jooq.generated.tables;


import edu.uci.ics.texera.dataflow.jooq.generated.Keys;
import edu.uci.ics.texera.dataflow.jooq.generated.TexeraDb;
import edu.uci.ics.texera.dataflow.jooq.generated.tables.records.KeywordDictionaryRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeywordDictionary extends TableImpl<KeywordDictionaryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>texera_db.keyword_dictionary</code>
     */
    public static final KeywordDictionary KEYWORD_DICTIONARY = new KeywordDictionary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeywordDictionaryRecord> getRecordType() {
        return KeywordDictionaryRecord.class;
    }

    /**
     * The column <code>texera_db.keyword_dictionary.uid</code>.
     */
    public final TableField<KeywordDictionaryRecord, UInteger> UID = createField(DSL.name("uid"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>texera_db.keyword_dictionary.kid</code>.
     */
    public final TableField<KeywordDictionaryRecord, UInteger> KID = createField(DSL.name("kid"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>texera_db.keyword_dictionary.name</code>.
     */
    public final TableField<KeywordDictionaryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>texera_db.keyword_dictionary.content</code>.
     */
    public final TableField<KeywordDictionaryRecord, byte[]> CONTENT = createField(DSL.name("content"), SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>texera_db.keyword_dictionary.description</code>.
     */
    public final TableField<KeywordDictionaryRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    private KeywordDictionary(Name alias, Table<KeywordDictionaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeywordDictionary(Name alias, Table<KeywordDictionaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>texera_db.keyword_dictionary</code> table reference
     */
    public KeywordDictionary(String alias) {
        this(DSL.name(alias), KEYWORD_DICTIONARY);
    }

    /**
     * Create an aliased <code>texera_db.keyword_dictionary</code> table reference
     */
    public KeywordDictionary(Name alias) {
        this(alias, KEYWORD_DICTIONARY);
    }

    /**
     * Create a <code>texera_db.keyword_dictionary</code> table reference
     */
    public KeywordDictionary() {
        this(DSL.name("keyword_dictionary"), null);
    }

    public <O extends Record> KeywordDictionary(Table<O> child, ForeignKey<O, KeywordDictionaryRecord> key) {
        super(child, key, KEYWORD_DICTIONARY);
    }

    @Override
    public Schema getSchema() {
        return TexeraDb.TEXERA_DB;
    }

    @Override
    public Identity<KeywordDictionaryRecord, UInteger> getIdentity() {
        return (Identity<KeywordDictionaryRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<KeywordDictionaryRecord> getPrimaryKey() {
        return Keys.KEY_KEYWORD_DICTIONARY_PRIMARY;
    }

    @Override
    public List<UniqueKey<KeywordDictionaryRecord>> getKeys() {
        return Arrays.<UniqueKey<KeywordDictionaryRecord>>asList(Keys.KEY_KEYWORD_DICTIONARY_UID, Keys.KEY_KEYWORD_DICTIONARY_PRIMARY);
    }

    @Override
    public List<ForeignKey<KeywordDictionaryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<KeywordDictionaryRecord, ?>>asList(Keys.KEYWORD_DICTIONARY_IBFK_1);
    }

    public User user() {
        return new User(this, Keys.KEYWORD_DICTIONARY_IBFK_1);
    }

    @Override
    public KeywordDictionary as(String alias) {
        return new KeywordDictionary(DSL.name(alias), this);
    }

    @Override
    public KeywordDictionary as(Name alias) {
        return new KeywordDictionary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeywordDictionary rename(String name) {
        return new KeywordDictionary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KeywordDictionary rename(Name name) {
        return new KeywordDictionary(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UInteger, UInteger, String, byte[], String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
