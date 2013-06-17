
Editor with syntax highlighting
-------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/syntaxtext](http://artifacts.griffon-framework.org/plugin/syntaxtext)


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

