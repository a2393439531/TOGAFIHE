/**
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture.tests;

import com.google.inject.Inject;
import com.spirit.xtext.architecture.tests.TgfiInjectorProvider;
import com.spirit.xtext.architecture.tgfi.Tgfi;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(TgfiInjectorProvider.class)
@SuppressWarnings("all")
public class TgfiParsingTest {
  @Inject
  private ParseHelper<Tgfi> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ArchitecturalElement SecurePIX {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("JavaPackage: \"com.spirit.togaf.bb.test\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Name: \"Secure PIX\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Version: \"1.0\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Status: \"Released\" ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Objective: \"Provides a Secure PIX connection\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("HL_Function: \"Definition of the HL Function\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Rules: {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("add_security: \"*/PI->Sconn/SR\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("add_security_to_ds: \"*/DS->SConn/SR\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("} ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* This is the definition of the PIX profile in IHE");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Profile PI {             ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Name: \"PI\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Description: \"Patient Identification\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Features: \"Patient Match\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Function: \"Patient Management\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("actors: ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"PIC\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"PIS\"  ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("transactions:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(\"PIC\", \"Feed\", \"PIS\")");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(\"PIC\", \"PIXQuery\", \"PIS\")");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("domains:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"Information\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("quality_attributes:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("att1 [\"pi.levenstein.match_score<.9\"]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("att2 [\"pi.levenstein.match_sec<200\"]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("att3 [\"pi.soundex.match_score<.83\"]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("att4 [\"pi.soundex.match_sec<400\"]");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Profile DS {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Name: \"DS\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Description: \"Document Sharing\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Features: \"Shares Document\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Function: \"Document Management\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("actors:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"DSAct\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"DC\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"DSto\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("transactions:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(\"DC\", \"Query\", \"DSto\")");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(\"DSAct\", \"Insert\", \"DSto\")");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("domains:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"Semantics\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("quality_attributes:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/*");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* This is the definition of the ATNA profile in IHE");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Profile SR {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Name: \"SR\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Description: \"Security Requirements\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Features: \"Provides Security\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Function: \"Security\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("actors:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"SConn\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("transactions:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(\"SConn\", \"Connect\", \"SConn\")");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("domains:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"Security\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("quality_attributes:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("att1 [\"sr.hw.hs_sec<3000\"]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("att2 [\"sr.sw.hs_sec<1000\"]");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final Tgfi result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
