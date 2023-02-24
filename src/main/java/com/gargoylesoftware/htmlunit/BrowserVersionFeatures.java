/*
 * Copyright (c) 2002-2010 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.htmlunit;

/**
 * Constants of various features of each {@link BrowserVersion}.
 *
 * @version $Revision: 5877 $
 * @author Ahmed Ashour
 * @author Marc Guillemot
 * @author Sudhan Moghe
 */
public enum BrowserVersionFeatures {

    /** Indicates that a blur event should be triggered before an onchange event. */
    BLUR_BEFORE_ONCHANGE,

    /** If the "type" attribute of HtmlButton should be evaluated to 'button' if not specified. */
    BUTTON_EMPTY_TYPE_BUTTON,

    /** Indicates that the browser can inherit CSS property values. */
    CAN_INHERIT_CSS_PROPERTY_VALUES,

    /** Indicates that document.createEvent() initializes the target property. This is what FF2 does but not FF3. */
    CREATEEVENT_INITALIZES_TARGET,

    /** Was originally .isFirefox(). */
    CSS_DISPLAY_DEFAULT,

    /** */
    DIALOGWINDOW_REFERER,

    /** Indicates that "\n" are replaced by "\r\n" in textarea values. */
    DISPLAYED_COLLAPSE,

    /** */
    DOCTYPE_4_0_TRANSITIONAL_STANDARDS,

    /** IE removes all child text nodes, but FF preserves the first. */
    DOM_NORMALIZE_REMOVE_CHILDREN,

    /** Triggers "DOMContentLoaded" event. */
    EVENT_DOM_CONTENT_LOADED,

    /** Triggers "input" event. */
    EVENT_INPUT,

    /** Triggers "onchange" event handler on losing focus. */
    EVENT_ONCHANGE_LOSING_FOCUS,

    /** Triggers "propertychange" event. */
    EVENT_PROPERTY_CHANGE,

    /** Indicates that document.execCommand() should throw an exception when called with an illegal command. */
    EXECCOMMAND_THROWS_ON_WRONG_COMMAND,

    /** */
    FILEINPUT_EMPTY_DEFAULT_VALUE,

    /** Indicates if a form field is directly reachable by its new name once this has been changed. */
    FORMFIELD_REACHABLE_BY_NEW_NAMES,

    /** */
    FORM_SUBMISSION_URL_END_WITH_QUESTIONMARK,

    /** Was originally .isIE(). */
    GENERATED_1,

    /** Was originally .isIE(). */
    GENERATED_10,

    /** Was originally .isIE(). */
    GENERATED_100,

    /** Was originally .isIE(). */
    GENERATED_101,

    /** Was originally .isIE(). */
    GENERATED_102,

    /** Was originally .isIE(). */
    GENERATED_103,

    /** Was originally .isIE(). */
    GENERATED_104,

    /** Was originally .isIE(). */
    GENERATED_105,

    /** Was originally .isIE(). */
    GENERATED_106,

    /** Was originally .isIE(). */
    GENERATED_107,

    /** Was originally .isIE(). */
    GENERATED_108,

    /** Was originally .isIE(). */
    GENERATED_109,

    /** Was originally .isIE(). */
    GENERATED_11,

    /** Was originally .isIE(). */
    GENERATED_110,

    /** Was originally .isIE(). */
    GENERATED_111,

    /** Was originally .isIE(). */
    GENERATED_112,

    /** Was originally .isIE(). */
    GENERATED_113,

    /** Was originally .isIE(). */
    GENERATED_114,

    /** Was originally .isIE(). */
    GENERATED_115,

    /** Was originally .isIE(). */
    GENERATED_116,

    /** Was originally .isIE(). */
    GENERATED_117,

    /** Was originally .isIE(). */
    GENERATED_118,

    /** Was originally .isIE(). */
    GENERATED_119,

    /** Was originally .isIE(). */
    GENERATED_12,

    /** Was originally .isIE(). */
    GENERATED_120,

    /** Was originally .isIE(). */
    GENERATED_121,

    /** Was originally .isIE(). */
    GENERATED_122,

    /** Was originally .isIE(). */
    GENERATED_123,

    /** Was originally .isIE(). */
    GENERATED_124,

    /** Was originally .isIE(). */
    GENERATED_125,

    /** Was originally .isIE(). */
    GENERATED_126,

    /** Was originally .isIE(). */
    GENERATED_127,

    /** Was originally .isIE(). */
    GENERATED_128,

    /** Was originally .isIE(). */
    GENERATED_129,

    /** Was originally .isIE(). */
    GENERATED_13,

    /** Was originally .isIE(). */
    GENERATED_130,

    /** Was originally .isIE(). */
    GENERATED_131,

    /** Was originally .isIE(). */
    GENERATED_132,

    /** Was originally .isIE(). */
    GENERATED_133,

    /** Was originally .isIE(). */
    GENERATED_134,

    /** Was originally .isIE(). */
    GENERATED_135,

    /** Was originally .isIE(). */
    GENERATED_136,

    /** Was originally .isIE(). */
    GENERATED_137,

    /** Was originally .isIE(). */
    GENERATED_138,

    /** Was originally .isIE(). */
    GENERATED_139,

    /** Was originally .isIE(). */
    GENERATED_140,

    /** Was originally .isIE(). */
    GENERATED_141,

    /** Was originally .isIE(). */
    GENERATED_142,

    /** Was originally .isIE(). */
    GENERATED_143,

    /** Was originally .isIE(). */
    GENERATED_144,

    /** Was originally .isIE(). */
    GENERATED_145,

    /** Was originally .isIE(). */
    GENERATED_146,

    /** Was originally .isIE(). */
    GENERATED_147,

    /** Was originally .isIE(). */
    GENERATED_148,

    /** Was originally .isIE(). */
    GENERATED_15,

    /** Was originally .isIE(). */
    GENERATED_150,

    /** Was originally .isFirefox(). */
    GENERATED_151,

    /** Was originally .isFirefox(). */
    GENERATED_152,

    /** Was originally .isFirefox(). */
    GENERATED_153,

    /** Was originally .isFirefox(). */
    GENERATED_154,

    /** Was originally .isFirefox(). */
    GENERATED_155,

    /** Was originally .isFirefox(). */
    GENERATED_156,

    /** Was originally .isFirefox(). */
    GENERATED_157,

    /** Was originally .isFirefox(). */
    GENERATED_158,

    /** Was originally .isFirefox(). */
    GENERATED_159,

    /** Was originally .isIE(). */
    GENERATED_16,

    /** Was originally .isFirefox(). */
    GENERATED_160,

    /** Was originally .isFirefox(). */
    GENERATED_161,

    /** Was originally .isFirefox(). */
    GENERATED_162,

    /** Was originally .isFirefox(). */
    GENERATED_163,

    /** Was originally .isFirefox(). */
    GENERATED_164,

    /** Was originally .isFirefox(). */
    GENERATED_165,

    /** Was originally .isFirefox(). */
    GENERATED_166,

    /** Was originally .isFirefox(). */
    GENERATED_167,

    /** Was originally .isFirefox(). */
    GENERATED_168,

    /** Was originally .isFirefox(). */
    GENERATED_169,

    /** Was originally .isIE(). */
    GENERATED_17,

    /** Was originally .isFirefox(). */
    GENERATED_170,

    /** Was originally .isFirefox(). */
    GENERATED_171,

    /** Was originally .isFirefox(). */
    GENERATED_172,

    /** Was originally .isFirefox(). */
    GENERATED_173,

    /** Was originally .isFirefox(). */
    GENERATED_174,

    /** Was originally .isFirefox(). */
    GENERATED_175,

    /** Was originally .isFirefox(). */
    GENERATED_176,

    /** Was originally .isFirefox(). */
    GENERATED_177,

    /** Was originally .isIE(). */
    GENERATED_18,

    /** Was originally .isIE(). */
    GENERATED_19,

    /** Was originally .isIE(). */
    GENERATED_2,

    /** Was originally .isIE(). */
    GENERATED_20,

    /** Was originally .isIE(). */
    GENERATED_21,

    /** Was originally .isIE(). */
    GENERATED_22,

    /** Was originally .isIE(). */
    GENERATED_23,

    /** Was originally .isIE(). */
    GENERATED_24,

    /** Was originally .isIE(). */
    GENERATED_25,

    /** Was originally .isIE(). */
    GENERATED_26,

    /** Was originally .isIE(). */
    GENERATED_27,

    /** Was originally .isIE(). */
    GENERATED_28,

    /** Was originally .isIE(). */
    GENERATED_29,

    /** Was originally .isIE(). */
    GENERATED_3,

    /** Was originally .isIE(). */
    GENERATED_30,

    /** Was originally .isIE(). */
    GENERATED_31,

    /** Was originally .isIE(). */
    GENERATED_32,

    /** Was originally .isIE(). */
    GENERATED_33,

    /** Was originally .isIE(). */
    GENERATED_34,

    /** Was originally .isIE(). */
    GENERATED_35,

    /** Was originally .isIE(). */
    GENERATED_36,

    /** Was originally .isIE(). */
    GENERATED_37,

    /** Was originally .isIE(). */
    GENERATED_38,

    /** Was originally .isIE(). */
    GENERATED_39,

    /** Was originally .isIE(). */
    GENERATED_4,

    /** Was originally .isIE(). */
    GENERATED_40,

    /** Was originally .isIE(). */
    GENERATED_41,

    /** Was originally .isIE(). */
    GENERATED_42,

    /** Was originally .isIE(). */
    GENERATED_43,

    /** Was originally .isIE(). */
    GENERATED_44,

    /** Was originally .isIE(). */
    GENERATED_45,

    /** Was originally .isIE(). */
    GENERATED_46,

    /** Was originally .isIE(). */
    GENERATED_47,

    /** Was originally .isIE(). */
    GENERATED_48,

    /** Was originally .isIE(). */
    GENERATED_49,

    /** Was originally .isIE(). */
    GENERATED_5,

    /** Was originally .isIE(). */
    GENERATED_50,

    /** Was originally .isIE(). */
    GENERATED_51,

    /** Was originally .isIE(). */
    GENERATED_52,

    /** Was originally .isIE(). */
    GENERATED_53,

    /** Was originally .isIE(). */
    GENERATED_54,

    /** Was originally .isIE(). */
    GENERATED_55,

    /** Was originally .isIE(). */
    GENERATED_56,

    /** Was originally .isIE(). */
    GENERATED_57,

    /** Was originally .isIE(). */
    GENERATED_58,

    /** Was originally .isIE(). */
    GENERATED_59,

    /** Was originally .isIE(). */
    GENERATED_6,

    /** Was originally .isIE(). */
    GENERATED_60,

    /** Was originally .isIE(). */
    GENERATED_61,

    /** Was originally .isIE(). */
    GENERATED_62,

    /** Was originally .isIE(). */
    GENERATED_63,

    /** Was originally .isIE(). */
    GENERATED_64,

    /** Was originally .isIE(). */
    GENERATED_65,

    /** Was originally .isIE(). */
    GENERATED_66,

    /** Was originally .isIE(). */
    GENERATED_67,

    /** Was originally .isIE(). */
    GENERATED_68,

    /** Was originally .isIE(). */
    GENERATED_69,

    /** Was originally .isIE(). */
    GENERATED_7,

    /** Was originally .isIE(). */
    GENERATED_70,

    /** Was originally .isIE(). */
    GENERATED_71,

    /** Was originally .isIE(). */
    GENERATED_72,

    /** Was originally .isIE(). */
    GENERATED_73,

    /** Was originally .isIE(). */
    GENERATED_74,

    /** Was originally .isIE(). */
    GENERATED_75,

    /** Was originally .isIE(). */
    GENERATED_76,

    /** Was originally .isIE(). */
    GENERATED_77,

    /** Was originally .isIE(). */
    GENERATED_78,

    /** Was originally .isIE(). */
    GENERATED_79,

    /** Was originally .isIE(). */
    GENERATED_8,

    /** Was originally .isIE(). */
    GENERATED_80,

    /** Was originally .isIE(). */
    GENERATED_81,

    /** Was originally .isIE(). */
    GENERATED_82,

    /** Was originally .isIE(). */
    GENERATED_83,

    /** Was originally .isIE(). */
    GENERATED_84,

    /** Was originally .isIE(). */
    GENERATED_85,

    /** Was originally .isIE(). */
    GENERATED_86,

    /** Was originally .isIE(). */
    GENERATED_87,

    /** Was originally .isIE(). */
    GENERATED_88,

    /** Was originally .isIE(). */
    GENERATED_89,

    /** Was originally .isIE(). */
    GENERATED_9,

    /** Was originally .isIE(). */
    GENERATED_90,

    /** Was originally .isIE(). */
    GENERATED_91,

    /** Was originally .isIE(). */
    GENERATED_92,

    /** Was originally .isIE(). */
    GENERATED_93,

    /** Was originally .isIE(). */
    GENERATED_94,

    /** Was originally .isIE(). */
    GENERATED_95,

    /** Was originally .isIE(). */
    GENERATED_96,

    /** Was originally .isIE(). */
    GENERATED_97,

    /** Was originally .isIE(). */
    GENERATED_98,

    /** Was originally .isIE(). */
    GENERATED_99,

    /** */
    HEADER_CONTENT_DISPOSITION_ABSOLUTE_PATH,

    /** */
    HTMLABBREVIATED,

    /** Allows multiple elements with the same 'id'. */
    HTMLCOLLECTION_IDENTICAL_IDS,

    /** Allows invalid 'align' values. */
    HTMLELEMENT_ALIGN_INVALID,

    /** */
    HTMLELEMENT_CLASS_ATTRIBUTE,

    /** */
    HTMLIMAGE_NAME_VALUE_PARAMS,

    /** */
    HTMLINPUT_DEFAULT_IS_CHECKED,

    /** */
    HTMLOPTIONGROUP_NO_DISABLED,

    /** */
    HTMLOPTION_EMPTY_TEXT_IS_NO_CHILDREN,

    /** */
    HTMLOPTION_PREVENT_DISABLED,

    /** */
    HTMLSCRIPT_APPLICATION_JAVASCRIPT,

    /** Runs <script src="javascript:'[code]'">. */
    HTMLSCRIPT_SRC_JAVASCRIPT,

    /** Have a default value of body.link, body.vLink, etc. */
    HTML_BODY_COLOR,

    /** Indicates that "host" HTTP header should be the first. */
    HTTP_HEADER_HOST_FIRST,

    /** Indicates that the browser should ignore contents of inner head elements. */
    IGNORE_CONTENTS_OF_INNER_HEAD,

    /** */
    JAVASCRIPT_DEFERRED,

    /** Always "[object]". */
    JAVASCRIPT_OBJECT_ONLY,

    /** Evaluates to "[object Element]". */
    JAVASCRIPT_OBJECT_PREFIX,

    /** Indicates that the URL of parent window is used to resolve URLs in frames with javascript src. */
    JS_FRAME_RESOLVE_URL_WITH_PARENT_WINDOW,

    /** */
    PAGE_SELECTION_RANGE_FROM_SELECTABLE_TEXT_INPUT,

    /** */
    PAGE_WAIT_LAOD_BEFORE_BODY,

    /** Supports 'data' protocol. */
    PROTOCOL_DATA,

    /** Indicates .querySelectorAll() is supported in only quirks mode. */
    QUERYSELECTORALL_QUIRKS,

    /** Indicates that a read only JS property can be... set as done by IE and FF2 but not FF3. */
    SET_READONLY_PROPERTIES,

    /** Indicates [object StorageObsolete] instead of [object Storage]. */
    STORAGE_OBSOLETE,

    /** Indicates that string.trim(), .trimLeft() and .trimRight() are supported. */
    STRING_TRIM,

    /**
     * Indicates that the href property for a &lt;link rel="stylesheet" type="text/css" href="..." /&gt;
     * is the fully qualified URL.
     */
    STYLESHEET_HREF_EXPANDURL,

    /** Indicates that the href property for a &lt;style type="text/css"&gt; ... &lt;/style&gt; is "". */
    STYLESHEET_HREF_STYLE_EMPTY,

    /** Indicates that the href property for a &lt;style type="text/css"&gt; ... &lt;/style&gt; is null. */
    STYLESHEET_HREF_STYLE_NULL,

    /** Indicates that "\n" are replaced by "\r\n" in textarea values. */
    TEXTAREA_CRNL,

    /** Indicates that the browser treats "position: fixed" as if it were "position: static". */
    TREATS_POSITION_FIXED_LIKE_POSITION_STATIC,

    /** */
    URL_MINIMAL_QUERY_ENCODING,

    /** */
    URL_MISSING_SLASHES,

    /** */
    WINDOW_ACTIVE_ELEMENT_FOCUSED,

    /** Indicates that 'this' corresponds to the handler function when a XMLHttpRequest handler is executed. */
    XMLHTTPREQUEST_HANDLER_THIS_IS_FUNCTION;

}
