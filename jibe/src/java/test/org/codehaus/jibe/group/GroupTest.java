package org.codehaus.jibe.group;

import org.codehaus.jibe.JibeTestCase;
import org.codehaus.jibe.JibeSessionFactory;
import org.codehaus.jibe.LocalSessionFactory;

import java.util.Properties;

public class GroupTest
    extends JibeTestCase
{
    public void testJoin()
        throws Exception
    {
        Properties props = new Properties();

        props.setProperty( JibeSessionFactory.SESSION_FACTORY_PROPERTY,
                           LocalSessionFactory.class.getName() );

        Group group = Group.join( "node-1",
                                  "cheese",
                                  props );

        assertNotNull( group );
    }
}