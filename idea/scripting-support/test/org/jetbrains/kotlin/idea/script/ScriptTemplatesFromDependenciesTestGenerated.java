/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.script;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/scripting-support/testData/script/templatesFromDependencies")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ScriptTemplatesFromDependenciesTestGenerated extends AbstractScriptTemplatesFromDependenciesTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTemplatesFromDependencies() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/scripting-support/testData/script/templatesFromDependencies"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("inJar")
    public void testInJar() throws Exception {
        runTest("idea/scripting-support/testData/script/templatesFromDependencies/inJar/");
    }

    @TestMetadata("inTests")
    public void testInTests() throws Exception {
        runTest("idea/scripting-support/testData/script/templatesFromDependencies/inTests/");
    }

    @TestMetadata("multipleRoots")
    public void testMultipleRoots() throws Exception {
        runTest("idea/scripting-support/testData/script/templatesFromDependencies/multipleRoots/");
    }

    @TestMetadata("multipleTemplates")
    public void testMultipleTemplates() throws Exception {
        runTest("idea/scripting-support/testData/script/templatesFromDependencies/multipleTemplates/");
    }

    @TestMetadata("outsideRoots")
    public void testOutsideRoots() throws Exception {
        runTest("idea/scripting-support/testData/script/templatesFromDependencies/outsideRoots/");
    }

    @TestMetadata("singleTemplate")
    public void testSingleTemplate() throws Exception {
        runTest("idea/scripting-support/testData/script/templatesFromDependencies/singleTemplate/");
    }
}
