package com.example.firsttestingapp

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class LocationESRule : TestRule {
    var assertions: Assertions? = null

    override fun apply(base: Statement, description: Description): Statement {
        return object : Statement() {
            override fun evaluate() {
                assertions = Assertions()
                assertions?.setLocation("MX")
                base.evaluate()
                assertions = null
            }
        }
    }
}