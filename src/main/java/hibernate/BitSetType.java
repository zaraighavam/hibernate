package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.DiscriminatorType;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import java.util.BitSet;

public class BitSetType{}
//todo
//        extends AbstractSingleColumnStandardBasicType<BitSet>
//        implements DiscriminatorType<BitSet> {
//
//    public static final BitSetType INSTANCE = new BitSetType();
//
//    public BitSetType() {
//        super( VarcharTypeDescriptor.INSTANCE, BitSetTypeDescriptor.INSTANCE );
//    }
//
//    @Override
//    public BitSet stringToObject(String xml) throws Exception {
//        return fromString( xml );
//    }
//
//    @Override
//    public String objectToSQLString(BitSet value, Dialect dialect) throws Exception {
//        return toString( value );
//    }
//
//    @Override
//    public String getName() {
//        return "bitset";
//    }
