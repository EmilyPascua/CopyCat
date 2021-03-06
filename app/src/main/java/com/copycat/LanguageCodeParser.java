package com.copycat;

/**
 * Created by marco on 11/15/2017.
 */

public class LanguageCodeParser {

    public static String getLanguageCode(String language) {
        switch (language) {
            case "Afrikaans":
                return "af";
            case "Albanian":
                return "sq";
            case "Amharic":
                return "am";
            case "Arabic":
                return "ar";
            case "Armenian":
                return "hy";
            case "Azeerbaijani":
                return "az";
            case "Basque":
                return "eu";
            case "Belarusian":
                return "be";
            case "Bengali":
                return "bn";
            case "Bosnian":
                return "bs";
            case "Bulgarian":
                return "bg";
            case "Catalan":
                return "ca";
            case "Cebuano":
                return "ceb";
            case "Chinese (Simplified)\t":
                return "zh-CN";
            case "Chinese (Traditional)\t":
                return "zh-TW";
            case "Corsican":
                return "co";
            case "Croatian":
                return "hr";
            case "Czech":
                return "cs";
            case "Danish":
                return "da";
            case "Dutch":
                return "nl";
            case "English":
                return "en";
            case "Esperanto":
                return "eo";
            case "Estonian":
                return "et";
            case "Finnish":
                return "fi";
            case "French":
                return "fr";
            case "Frisian":
                return "fy";
            case "Galician":
                return "gl";
            case "Georgian":
                return "ka";
            case "German":
                return "de";
            case "Greek":
                return "el";
            case "Gujarati":
                return "gu";
            case "Haitian Creole":
                return "ht";
            case "Hausa":
                return "ha";
            case "Hawaiian":
                return "haw";
            case "Hebrew":
                return "iw";
            case "Hindi":
                return "hi";
            case "Hmong":
                return "hmn";
            case "Hungarian":
                return "hu";
            case "Icelandic":
                return "is";
            case "Igbo":
                return "ig";
            case "Indonesian":
                return "id";
            case "Irish":
                return "ga";
            case "Italian":
                return "it";
            case "Japanese":
                return "ja";
            case "Javanese":
                return "jw";
            case "Kannada":
                return "kn";
            case "Kazakh":
                return "kk";
            case "Khmer":
                return "km";
            case "Korean":
                return "ko";
            case "Kurdish":
                return "ku";
            case "Kyrgyz":
                return "ky";
            case "Lao":
                return "lo";
            case "Latin":
                return "la";
            case "Latvian":
                return "lv";
            case "Lithuanian":
                return "lt";
            case "Luxembourgish":
                return "lb";
            case "Macedonian":
                return "mk";
            case "Malagasy":
                return "mg";
            case "Malay":
                return "ms";
            case "Malayalam":
                return "ml";
            case "Maltese":
                return "mt";
            case "Maori":
                return "mi";
            case "Marathi":
                return "mr";
            case "Mongolian":
                return "mn";
            case "Myanmar (Burmese)":
                return "my";
            case "Nepali":
                return "ne";
            case "Norwegian":
                return "no";
            case "Nyanja (Chichewa)":
                return "ny";
            case "Pashto":
                return "ps";
            case "Persian":
                return "fa";
            case "Polish":
                return "pl";
            case "Portuguese (Portugal, Brazil)":
                return "pt";
            case "Punjabi":
                return "pa";
            case "Romanian":
                return "ro";
            case "Russian":
                return "ru";
            case "Samoan":
                return "sm";
            case "Scots Gaelic":
                return "gd";
            case "Serbian":
                return "sr";
            case "Sesotho":
                return "st";
            case "Shona":
                return "sn";
            case "Sindhi":
                return "sd";
            case "Sinhala (Sinhalese)":
                return "si";
            case "Slovak":
                return "sk";
            case "Slovenian":
                return "sl";
            case "Somali":
                return "so";
            case "Spanish":
                return "es";
            case "Sundanese":
                return "su";
            case "Swahili":
                return "sw";
            case "Swedish":
                return "sv";
            case "Tagalog (Filipino)":
                return "tl";
            case "Tajik":
                return "tg";
            case "Tamil":
                return "ta";
            case "Telugu":
                return "te";
            case "Thai":
                return "th";
            case "Turkish":
                return "tr";
            case "Ukrainian":
                return "uk";
            case "Urdu":
                return "ur";
            case "Uzbek":
                return "uz";
            case "Vietnamese":
                return "vi";
            case "Welsh":
                return "cy";
            case "Xhosa":
                return "xh";
            case "Yiddish":
                return "yi";
            case "Yoruba":
                return "yo";
            case "Zulu":
                return "zu";
        }
        //if no corresponding languageCode is found:
        return null;
    }
}