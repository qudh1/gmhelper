package org.zz.gmhelper.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.zz.gmhelper.Sm2KeyExchangeUtil;

@RunWith(Suite.class)
@SuiteClasses({Sm2UtilTest.class, Sm3UtilTest.class, Sm4UtilTest.class, Sm2KeyExchangeUtilTest.class})
public class AllTest {
}
