package org.cap.test.service.bankTestSuite;

import org.cap.test.service.AccountServiceTest;
import org.cap.test.service.BadTestCategory;
import org.cap.test.service.DemoTestCase;
import org.cap.test.service.GoodTestCategory;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(BadTestCategory.class)
@SuiteClasses({DemoTestCase.class,AccountServiceTest.class})
public class AllTests {
	
}
