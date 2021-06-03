package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.categorii.TesteGetPromovabilitate;
import teste.categorii.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaSetUp.class, TestGrupaWithDummy.class,
		TestGrupaWithFake.class, TestGrupaWithStub.class })

@IncludeCategory(TesteGetPromovabilitate.class)
@ExcludeCategory(TesteNormale.class)
public class SuitaCustom {

}
