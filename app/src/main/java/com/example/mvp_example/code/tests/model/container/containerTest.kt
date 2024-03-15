import com.example.mvp_example.code.test.backend.model.TakeCorrectTypeModule
import com.example.mvp_example.code.tests.model.EmptyModelTest
import com.example.mvp_example.code.tests.model.GeneralPortfolioParamsIncorrectTypeTest
import org.koin.dsl.module

val testsModel = module{
    single { GeneralPortfolioParamsIncorrectTypeTest() }
    single { TakeCorrectTypeModule() }
    single { EmptyModelTest() }
}

//