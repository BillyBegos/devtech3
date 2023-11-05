import static org.junit.Assert;

import java.beans.Transient;

import org.junit.Test;

public class DevTech3 {
    JDBCConnectionMaker JDBC = new JDBCConnectionMaker(dbName, hostName, portNumber, userName, password);
    EntityBits bitsRecord1;
    EntityBits bitsRecord2;
    

    @Test
    public void testConnection(){
        assertNotNull(JDBC.getConnection());
    }

    @Test
    public voidTestConnectionNull(){
        assertNull((new JDBCConnectionMaker(null,null,null,null,null)).getConnection());
    }

    @Test
    public void testGetters(){

    }

    @Test
    public void testValidConstructor(){
        int validPrimaryKey = 1;

        EntityBits bits = new EntityBits(validPrimaryKey);

        assertEquals(bits.primaryKeyColumnName(), "Bits_pk");
        assertEquals(bits.primaryKeyColumnIndex(), "1");

        


        
        
        
    }

    @Test
    public void testInvalidConstructor(){
        int invalidPrimaryKey = 0;

        EntityBits bits = new EntityBits(invalidPrimaryKey);

        assertNull(bits.getMn());
        assertNull(bits.getOp());
        assertNull(bits.getQr());
    }

    @Test
    public void testNullConstructor(){
        EntityBits bits = new EntityBits();

        assertNull(bits.getMn());
        assertNull(bits.getOp());
        assertNull(bits.getQr());
    }


}
}
