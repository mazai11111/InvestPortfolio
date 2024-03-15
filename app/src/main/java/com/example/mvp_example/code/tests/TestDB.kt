package com.example.mvp_example.code.tests

import com.example.mvp_example.code.test.backend.model.TakeCorrectTypeModule
import com.example.mvp_example.code.tests.model.EmptyModelTest
import com.example.mvp_example.code.tests.model.GeneralPortfolioParamsIncorrectTypeTest
import com.google.gson.JsonSyntaxException
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.AutoCloseKoinTest
import org.koin.test.inject
import testsModel
import kotlin.test.assertFailsWith

class TestDB: AutoCloseKoinTest() {
    private val incorrectTypeModel: GeneralPortfolioParamsIncorrectTypeTest by inject()
    private val correctTypeModel: TakeCorrectTypeModule by inject()
    private val emptyModel: EmptyModelTest by inject()

    @Before
    fun setUp() {
        startKoin { modules(testsModel) }
    }

    @Test
    fun testModelIncorrectType(){
        assertFailsWith<JsonSyntaxException>("Expected JsonSyntaxException") {
            incorrectTypeModel.takeGeneralElement()
        }
    }

    @Test
    fun testModelEmptyJson(){
        assertFailsWith<IllegalArgumentException>("Expected IllegalArgumentException") {
            emptyModel.takeGeneralElement();
        }
    }

    @Test
    fun testModelCorrectType(){
        val result = correctTypeModel.takeGeneralElement();

        assertDoesNotThrow { result }
    }

    @After
    fun tearDown() {
        stopKoin()
    }
}