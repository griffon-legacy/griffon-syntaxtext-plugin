/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres.Almiray
 */
class SyntaxtextGriffonPlugin {
    // the plugin version
    String version = '0.2'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-syntaxtext-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Editor with syntax highlighting'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Enables the usage of [RSyntaxTextArea][1] and friend classes (Autocomplete and Spellcheck).

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*            | *Type*             | 
| ----------------- | ------------------ |
| rtextArea         | `RTextArea`        |
| rtsyntaxtTextArea | `RSyntaxtTextArea` |
| rtextScrollPane   | `RTextScrollPane`  |
| textEditorPane    | `TextEditorPane`   |

### Example

        import org.fife.ui.rsyntaxtextarea.SyntaxConstants
        application(title: 'ide',
          pack: true,
          locationByPlatform:true,
          iconImage: imageIcon('/griffon-icon-48x48.png').image,
          iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                       imageIcon('/griffon-icon-32x32.png').image,
                       imageIcon('/griffon-icon-16x16.png').image]) {
            rtextScrollPane {
                rsyntaxTextArea(syntaxEditingStyle: SyntaxConstants.SYNTAX_STYLE_JAVA)
            }
        }

[1]: http://sourceforge.net/projects/rsyntaxtextarea
'''
}
