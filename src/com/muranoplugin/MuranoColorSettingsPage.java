package com.muranoplugin;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;
/**
 * Created by gokrokve on 9/3/14.
 */
public class MuranoColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("KEYWORD", MuranoSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("KEY", MuranoSyntaxHighlighter.KEY),
            new AttributesDescriptor("STRING", MuranoSyntaxHighlighter.STRING),
            new AttributesDescriptor("NUMBER", MuranoSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("COMMENT", MuranoSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("VARIABLE", MuranoSyntaxHighlighter.VARIABLE),
            new AttributesDescriptor("FUNCTION", MuranoSyntaxHighlighter.FUNCTION),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return MuranoIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new MuranoSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "Namespaces:\n" +
                "  =: io.murano.apps.linux\n" +
                "  std: io.murano\n" +
                "  res: io.murano.resources\n" +
                "\n" +
                "Name: Telnet\n" +
                "\n" +
                "Extends: std:Application\n" +
                "\n" +
                "Properties:\n" +
                "  name:\n" +
                "    Contract: $.string().notNull()\n" +
                "\n" +
                "  instance:\n" +
                "    Contract: $.class(res:Instance).notNull()\n" +
                "\n" +
                "\n" +
                "Workflow:\n" +
                "  initialize:\n" +
                "    Body:\n" +
                "      - $.environment: $.find(std:Environment).require()\n" +
                "\n" +
                "  deploy:\n" +
                "    Body:\n" +
                "      - $this.find(std:Environment).reporter.report($this, 'Creating VM for Telnet instace.')\n" +
                "      - $securityGroupIngress:\n" +
                "          - ToPort: 23\n" +
                "            FromPort: 23\n" +
                "            IpProtocol: tcp\n" +
                "            External: True\n" +
                "      - $.environment.securityGroupManager.addGroupIngress($securityGroupIngress)\n" +
                "      - $.instance.deploy()\n" +
                "      - $this.find(std:Environment).reporter.report($this, 'Instance is created. Setup Telnet service.')\n" +
                "      - $resources: new('io.murano.system.Resources')\n" +
                "      # Deploy Telnet\n" +
                "      - $template: $resources.yaml('DeployTelnet.template')\n" +
                "      - $.instance.agent.call($template, $resources)\n" +
                "      - $this.find(std:Environment).reporter.report($this, 'Telnet service setup is done.')\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "MuranoPL";
    }
}
