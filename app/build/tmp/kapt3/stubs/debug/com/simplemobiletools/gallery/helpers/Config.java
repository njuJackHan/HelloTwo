package com.simplemobiletools.gallery.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010#\n\u0003\b\u0080\u0001\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00e4\u00012\u00020\u0001:\u0002\u00e4\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u00c6\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0017\u0010\u00c9\u0001\u001a\u00030\u00c7\u00012\r\u0010\u00ca\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060@J\u0011\u0010\u00cb\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0017\u0010\u00cc\u0001\u001a\u00030\u00c7\u00012\r\u0010\u00ca\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060@J\u000f\u0010\u00cd\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060@H\u0002J\t\u0010\u00ce\u0001\u001a\u00020/H\u0002J\t\u0010\u00cf\u0001\u001a\u00020/H\u0002J\t\u0010\u00d0\u0001\u001a\u00020\u0006H\u0002J*\u0010A\u001a&\u0012\r\u0012\u000b \u00d2\u0001*\u0004\u0018\u00010\u00060\u00060\u00d1\u0001j\u0012\u0012\r\u0012\u000b \u00d2\u0001*\u0004\u0018\u00010\u00060\u0006`\u00d3\u0001J\u0010\u0010\u00d4\u0001\u001a\u00020/2\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0010\u0010\u00d5\u0001\u001a\u00020/2\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\t\u0010\u00d6\u0001\u001a\u00020\u0006H\u0002J\u0010\u0010\u00d7\u0001\u001a\u00020\f2\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0010\u0010\u00d8\u0001\u001a\u00020\f2\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u000f\u0010\u00d9\u0001\u001a\n\u0012\u0005\u0012\u00030\u00db\u00010\u00da\u0001J\u0011\u0010\u00dc\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0011\u0010\u00dd\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0011\u0010\u00de\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0011\u0010\u00df\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u0006J\u0017\u0010\u00e0\u0001\u001a\u00030\u00c7\u00012\r\u0010\u00ca\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060@J\u001a\u0010\u00e1\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u00062\u0007\u0010\u00e2\u0001\u001a\u00020/J\u001a\u0010\u00e3\u0001\u001a\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u00062\u0007\u0010\u00e2\u0001\u001a\u00020/R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R$\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R$\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R$\u0010%\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\u000e\"\u0004\b\'\u0010\u0010R$\u0010(\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R$\u0010+\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R$\u0010.\u001a\u00020/2\u0006\u0010.\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u00020/2\u0006\u00104\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u00101\"\u0004\b7\u00103R$\u00109\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R$\u0010<\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010\u0010R0\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060@2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060@8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR0\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060F2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060F8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010I\u001a\u00020/2\u0006\u0010I\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u00101\"\u0004\bK\u00103R$\u0010L\u001a\u00020/2\u0006\u0010L\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bM\u00101\"\u0004\bN\u00103R$\u0010O\u001a\u00020/2\u0006\u0010O\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u00101\"\u0004\bQ\u00103R$\u0010R\u001a\u00020\f2\u0006\u0010R\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010\u000e\"\u0004\bT\u0010\u0010R$\u0010U\u001a\u00020\f2\u0006\u0010U\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\u0010R0\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00060F2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00060F8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010B\"\u0004\bZ\u0010DR$\u0010[\u001a\u00020\f2\u0006\u0010[\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\u000e\"\u0004\b\\\u0010\u0010R$\u0010]\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b^\u0010\b\"\u0004\b_\u0010\nR$\u0010`\u001a\u00020\f2\u0006\u0010`\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010\u000e\"\u0004\bb\u0010\u0010R$\u0010d\u001a\u00020\f2\u0006\u0010c\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\be\u0010\u000e\"\u0004\bf\u0010\u0010R$\u0010g\u001a\u00020\f2\u0006\u0010g\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bh\u0010\u000e\"\u0004\bi\u0010\u0010R$\u0010j\u001a\u00020/2\u0006\u0010j\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bk\u00101\"\u0004\bl\u00103R$\u0010m\u001a\u00020\f2\u0006\u0010m\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bn\u0010\u000e\"\u0004\bo\u0010\u0010R0\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00060@2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00060@8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bq\u0010B\"\u0004\br\u0010DR$\u0010s\u001a\u00020/2\u0006\u0010s\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bt\u00101\"\u0004\bu\u00103R\u001a\u0010v\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u000e\"\u0004\bx\u0010\u0010R$\u0010y\u001a\u00020\f2\u0006\u0010y\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bz\u0010\u000e\"\u0004\b{\u0010\u0010R$\u0010|\u001a\u00020\f2\u0006\u0010|\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b}\u0010\u000e\"\u0004\b~\u0010\u0010R\'\u0010\u0080\u0001\u001a\u00020\f2\u0006\u0010\u007f\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010\u000e\"\u0005\b\u0082\u0001\u0010\u0010R(\u0010\u0083\u0001\u001a\u00020\f2\u0007\u0010\u0083\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u000e\"\u0005\b\u0085\u0001\u0010\u0010R(\u0010\u0086\u0001\u001a\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010\u000e\"\u0005\b\u0088\u0001\u0010\u0010R(\u0010\u0089\u0001\u001a\u00020\f2\u0007\u0010\u0089\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010\u000e\"\u0005\b\u008b\u0001\u0010\u0010R(\u0010\u008c\u0001\u001a\u00020\f2\u0007\u0010\u008c\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008d\u0001\u0010\u000e\"\u0005\b\u008e\u0001\u0010\u0010R(\u0010\u008f\u0001\u001a\u00020\f2\u0007\u0010\u008f\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0090\u0001\u0010\u000e\"\u0005\b\u0091\u0001\u0010\u0010R(\u0010\u0092\u0001\u001a\u00020/2\u0007\u0010\u0092\u0001\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0093\u0001\u00101\"\u0005\b\u0094\u0001\u00103R(\u0010\u0095\u0001\u001a\u00020\f2\u0007\u0010\u0095\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010\u000e\"\u0005\b\u0097\u0001\u0010\u0010R(\u0010\u0098\u0001\u001a\u00020\f2\u0007\u0010\u0098\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010\u000e\"\u0005\b\u009a\u0001\u0010\u0010R(\u0010\u009b\u0001\u001a\u00020\f2\u0007\u0010\u009b\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010\u000e\"\u0005\b\u009d\u0001\u0010\u0010R(\u0010\u009e\u0001\u001a\u00020\u00062\u0007\u0010\u009e\u0001\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009f\u0001\u0010\b\"\u0005\b\u00a0\u0001\u0010\nR(\u0010\u00a1\u0001\u001a\u00020\f2\u0007\u0010\u00a1\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a2\u0001\u0010\u000e\"\u0005\b\u00a3\u0001\u0010\u0010R(\u0010\u00a4\u0001\u001a\u00020\f2\u0007\u0010\u00a4\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a5\u0001\u0010\u000e\"\u0005\b\u00a6\u0001\u0010\u0010R(\u0010\u00a7\u0001\u001a\u00020\f2\u0007\u0010\u00a7\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a8\u0001\u0010\u000e\"\u0005\b\u00a9\u0001\u0010\u0010R(\u0010\u00aa\u0001\u001a\u00020/2\u0007\u0010\u00aa\u0001\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ab\u0001\u00101\"\u0005\b\u00ac\u0001\u00103R(\u0010\u00ad\u0001\u001a\u00020/2\u0007\u0010\u00ad\u0001\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ae\u0001\u00101\"\u0005\b\u00af\u0001\u00103R(\u0010\u00b0\u0001\u001a\u00020/2\u0007\u0010\u00b0\u0001\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b1\u0001\u00101\"\u0005\b\u00b2\u0001\u00103R(\u0010\u00b4\u0001\u001a\u00020\f2\u0007\u0010\u00b3\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b5\u0001\u0010\u000e\"\u0005\b\u00b6\u0001\u0010\u0010R(\u0010\u00b7\u0001\u001a\u00020\f2\u0007\u0010\u00b7\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b8\u0001\u0010\u000e\"\u0005\b\u00b9\u0001\u0010\u0010R(\u0010\u00ba\u0001\u001a\u00020\f2\u0007\u0010\u00ba\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bb\u0001\u0010\u000e\"\u0005\b\u00bc\u0001\u0010\u0010R(\u0010\u00bd\u0001\u001a\u00020\f2\u0007\u0010\u00bd\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00be\u0001\u0010\u000e\"\u0005\b\u00bf\u0001\u0010\u0010R(\u0010\u00c0\u0001\u001a\u00020\f2\u0007\u0010\u00c0\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c1\u0001\u0010\u000e\"\u0005\b\u00c2\u0001\u0010\u0010R(\u0010\u00c3\u0001\u001a\u00020\f2\u0007\u0010\u00c3\u0001\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c4\u0001\u0010\u000e\"\u0005\b\u00c5\u0001\u0010\u0010\u00a8\u0006\u00e5\u0001"}, d2 = {"Lcom/simplemobiletools/gallery/helpers/Config;", "Lcom/simplemobiletools/commons/helpers/BaseConfig;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "albumCovers", "", "getAlbumCovers", "()Ljava/lang/String;", "setAlbumCovers", "(Ljava/lang/String;)V", "allowInstantChange", "", "getAllowInstantChange", "()Z", "setAllowInstantChange", "(Z)V", "allowPhotoGestures", "getAllowPhotoGestures", "setAllowPhotoGestures", "allowVideoGestures", "getAllowVideoGestures", "setAllowVideoGestures", "allowZoomingImages", "getAllowZoomingImages", "setAllowZoomingImages", "animateGifs", "getAnimateGifs", "setAnimateGifs", "autoplay", "autoplayVideos", "getAutoplayVideos", "setAutoplayVideos", "darkBackground", "blackBackground", "getBlackBackground", "setBlackBackground", "bottomActions", "getBottomActions", "setBottomActions", "cropThumbnails", "getCropThumbnails", "setCropThumbnails", "deleteEmptyFolders", "getDeleteEmptyFolders", "setDeleteEmptyFolders", "dirColumnCnt", "", "getDirColumnCnt", "()I", "setDirColumnCnt", "(I)V", "order", "directorySorting", "getDirectorySorting", "setDirectorySorting", "display", "displayFileNames", "getDisplayFileNames", "setDisplayFileNames", "doExtraCheck", "getDoExtraCheck", "setDoExtraCheck", "everShownFolders", "", "getEverShownFolders", "()Ljava/util/Set;", "setEverShownFolders", "(Ljava/util/Set;)V", "excludedFolders", "", "getExcludedFolders", "setExcludedFolders", "extendedDetails", "getExtendedDetails", "setExtendedDetails", "filterMedia", "getFilterMedia", "setFilterMedia", "groupBy", "getGroupBy", "setGroupBy", "hideExtendedDetails", "getHideExtendedDetails", "setHideExtendedDetails", "hideSystemUI", "getHideSystemUI", "setHideSystemUI", "includedFolders", "getIncludedFolders", "setIncludedFolders", "isThirdPartyIntent", "setThirdPartyIntent", "lastFilepickerPath", "getLastFilepickerPath", "setLastFilepickerPath", "loopSlideshow", "getLoopSlideshow", "setLoopSlideshow", "loop", "loopVideos", "getLoopVideos", "setLoopVideos", "maxBrightness", "getMaxBrightness", "setMaxBrightness", "mediaColumnCnt", "getMediaColumnCnt", "setMediaColumnCnt", "oneFingerZoom", "getOneFingerZoom", "setOneFingerZoom", "pinnedFolders", "getPinnedFolders", "setPinnedFolders", "screenRotation", "getScreenRotation", "setScreenRotation", "shouldShowHidden", "getShouldShowHidden", "setShouldShowHidden", "showAll", "getShowAll", "setShowAll", "showExtendedDetails", "getShowExtendedDetails", "setShowExtendedDetails", "showHiddenFolders", "showHiddenMedia", "getShowHiddenMedia", "setShowHiddenMedia", "showMediaCount", "getShowMediaCount", "setShowMediaCount", "showRecycleBinAtFolders", "getShowRecycleBinAtFolders", "setShowRecycleBinAtFolders", "slideshowIncludeGIFs", "getSlideshowIncludeGIFs", "setSlideshowIncludeGIFs", "slideshowIncludePhotos", "getSlideshowIncludePhotos", "setSlideshowIncludePhotos", "slideshowIncludeVideos", "getSlideshowIncludeVideos", "setSlideshowIncludeVideos", "slideshowInterval", "getSlideshowInterval", "setSlideshowInterval", "slideshowMoveBackwards", "getSlideshowMoveBackwards", "setSlideshowMoveBackwards", "slideshowRandomOrder", "getSlideshowRandomOrder", "setSlideshowRandomOrder", "slideshowUseFade", "getSlideshowUseFade", "setSlideshowUseFade", "tempFolderPath", "getTempFolderPath", "setTempFolderPath", "tempSkipDeleteConfirmation", "getTempSkipDeleteConfirmation", "setTempSkipDeleteConfirmation", "temporarilyShowHidden", "getTemporarilyShowHidden", "setTemporarilyShowHidden", "useRecycleBin", "getUseRecycleBin", "setUseRecycleBin", "viewTypeFiles", "getViewTypeFiles", "setViewTypeFiles", "viewTypeFolders", "getViewTypeFolders", "setViewTypeFolders", "visibleBottomActions", "getVisibleBottomActions", "setVisibleBottomActions", "wasShown", "wasHideFolderTooltipShown", "getWasHideFolderTooltipShown", "setWasHideFolderTooltipShown", "wasNewAppShown", "getWasNewAppShown", "setWasNewAppShown", "wasOTGHandled", "getWasOTGHandled", "setWasOTGHandled", "wasRecycleBinPinned", "getWasRecycleBinPinned", "setWasRecycleBinPinned", "wasSVGShowingHandled", "getWasSVGShowingHandled", "setWasSVGShowingHandled", "wereFavoritesPinned", "getWereFavoritesPinned", "setWereFavoritesPinned", "addExcludedFolder", "", "path", "addExcludedFolders", "paths", "addIncludedFolder", "addPinnedFolders", "getDataFolder", "getDefaultDirectoryColumnCount", "getDefaultMediaColumnCount", "getDirectoryColumnsField", "Ljava/util/HashSet;", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashSet;", "getFileSorting", "getFolderGrouping", "getMediaColumnsField", "hasCustomGrouping", "hasCustomSorting", "parseAlbumCovers", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/AlbumCover;", "removeExcludedFolder", "removeFileSorting", "removeFolderGrouping", "removeIncludedFolder", "removePinnedFolders", "saveFileSorting", "value", "saveFolderGrouping", "Companion", "gallery_debug"})
public final class Config extends com.simplemobiletools.commons.helpers.BaseConfig {
    private boolean shouldShowHidden;
    public static final com.simplemobiletools.gallery.helpers.Config.Companion Companion = null;
    
    public final int getDirectorySorting() {
        return 0;
    }
    
    public final void setDirectorySorting(int order) {
    }
    
    public final void saveFileSorting(@org.jetbrains.annotations.NotNull()
    java.lang.String path, int value) {
    }
    
    public final int getFileSorting(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return 0;
    }
    
    public final void removeFileSorting(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final boolean hasCustomSorting(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return false;
    }
    
    public final void saveFolderGrouping(@org.jetbrains.annotations.NotNull()
    java.lang.String path, int value) {
    }
    
    public final int getFolderGrouping(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return 0;
    }
    
    public final void removeFolderGrouping(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final boolean hasCustomGrouping(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return false;
    }
    
    public final boolean getWasHideFolderTooltipShown() {
        return false;
    }
    
    public final void setWasHideFolderTooltipShown(boolean wasShown) {
    }
    
    public final boolean getShouldShowHidden() {
        return false;
    }
    
    public final void setShouldShowHidden(boolean p0) {
    }
    
    public final boolean getShowHiddenMedia() {
        return false;
    }
    
    public final void setShowHiddenMedia(boolean showHiddenFolders) {
    }
    
    public final boolean getTemporarilyShowHidden() {
        return false;
    }
    
    public final void setTemporarilyShowHidden(boolean temporarilyShowHidden) {
    }
    
    public final boolean isThirdPartyIntent() {
        return false;
    }
    
    public final void setThirdPartyIntent(boolean isThirdPartyIntent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getPinnedFolders() {
        return null;
    }
    
    public final void setPinnedFolders(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> pinnedFolders) {
    }
    
    public final boolean getShowAll() {
        return false;
    }
    
    public final void setShowAll(boolean showAll) {
    }
    
    public final void addPinnedFolders(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> paths) {
    }
    
    public final void removePinnedFolders(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> paths) {
    }
    
    public final void addExcludedFolder(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final void addExcludedFolders(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> paths) {
    }
    
    public final void removeExcludedFolder(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getExcludedFolders() {
        return null;
    }
    
    public final void setExcludedFolders(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> excludedFolders) {
    }
    
    private final java.util.Set<java.lang.String> getDataFolder() {
        return null;
    }
    
    public final void addIncludedFolder(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final void removeIncludedFolder(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getIncludedFolders() {
        return null;
    }
    
    public final void setIncludedFolders(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> includedFolders) {
    }
    
    public final boolean getAutoplayVideos() {
        return false;
    }
    
    public final void setAutoplayVideos(boolean autoplay) {
    }
    
    public final boolean getAnimateGifs() {
        return false;
    }
    
    public final void setAnimateGifs(boolean animateGifs) {
    }
    
    public final boolean getMaxBrightness() {
        return false;
    }
    
    public final void setMaxBrightness(boolean maxBrightness) {
    }
    
    public final boolean getCropThumbnails() {
        return false;
    }
    
    public final void setCropThumbnails(boolean cropThumbnails) {
    }
    
    public final int getScreenRotation() {
        return 0;
    }
    
    public final void setScreenRotation(int screenRotation) {
    }
    
    public final boolean getLoopVideos() {
        return false;
    }
    
    public final void setLoopVideos(boolean loop) {
    }
    
    public final boolean getDisplayFileNames() {
        return false;
    }
    
    public final void setDisplayFileNames(boolean display) {
    }
    
    public final boolean getBlackBackground() {
        return false;
    }
    
    public final void setBlackBackground(boolean darkBackground) {
    }
    
    public final int getFilterMedia() {
        return 0;
    }
    
    public final void setFilterMedia(int filterMedia) {
    }
    
    public final int getDirColumnCnt() {
        return 0;
    }
    
    public final void setDirColumnCnt(int dirColumnCnt) {
    }
    
    public final boolean getOneFingerZoom() {
        return false;
    }
    
    public final void setOneFingerZoom(boolean oneFingerZoom) {
    }
    
    public final boolean getAllowInstantChange() {
        return false;
    }
    
    public final void setAllowInstantChange(boolean allowInstantChange) {
    }
    
    private final java.lang.String getDirectoryColumnsField() {
        return null;
    }
    
    private final int getDefaultDirectoryColumnCount() {
        return 0;
    }
    
    public final int getMediaColumnCnt() {
        return 0;
    }
    
    public final void setMediaColumnCnt(int mediaColumnCnt) {
    }
    
    private final java.lang.String getMediaColumnsField() {
        return null;
    }
    
    private final int getDefaultMediaColumnCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlbumCovers() {
        return null;
    }
    
    public final void setAlbumCovers(@org.jetbrains.annotations.NotNull()
    java.lang.String albumCovers) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.gallery.models.AlbumCover> parseAlbumCovers() {
        return null;
    }
    
    public final boolean getHideSystemUI() {
        return false;
    }
    
    public final void setHideSystemUI(boolean hideSystemUI) {
    }
    
    public final boolean getDeleteEmptyFolders() {
        return false;
    }
    
    public final void setDeleteEmptyFolders(boolean deleteEmptyFolders) {
    }
    
    public final boolean getAllowPhotoGestures() {
        return false;
    }
    
    public final void setAllowPhotoGestures(boolean allowPhotoGestures) {
    }
    
    public final boolean getAllowVideoGestures() {
        return false;
    }
    
    public final void setAllowVideoGestures(boolean allowVideoGestures) {
    }
    
    public final boolean getShowMediaCount() {
        return false;
    }
    
    public final void setShowMediaCount(boolean showMediaCount) {
    }
    
    public final int getSlideshowInterval() {
        return 0;
    }
    
    public final void setSlideshowInterval(int slideshowInterval) {
    }
    
    public final boolean getSlideshowIncludePhotos() {
        return false;
    }
    
    public final void setSlideshowIncludePhotos(boolean slideshowIncludePhotos) {
    }
    
    public final boolean getSlideshowIncludeVideos() {
        return false;
    }
    
    public final void setSlideshowIncludeVideos(boolean slideshowIncludeVideos) {
    }
    
    public final boolean getSlideshowIncludeGIFs() {
        return false;
    }
    
    public final void setSlideshowIncludeGIFs(boolean slideshowIncludeGIFs) {
    }
    
    public final boolean getSlideshowRandomOrder() {
        return false;
    }
    
    public final void setSlideshowRandomOrder(boolean slideshowRandomOrder) {
    }
    
    public final boolean getSlideshowUseFade() {
        return false;
    }
    
    public final void setSlideshowUseFade(boolean slideshowUseFade) {
    }
    
    public final boolean getSlideshowMoveBackwards() {
        return false;
    }
    
    public final void setSlideshowMoveBackwards(boolean slideshowMoveBackwards) {
    }
    
    public final boolean getLoopSlideshow() {
        return false;
    }
    
    public final void setLoopSlideshow(boolean loopSlideshow) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTempFolderPath() {
        return null;
    }
    
    public final void setTempFolderPath(@org.jetbrains.annotations.NotNull()
    java.lang.String tempFolderPath) {
    }
    
    public final int getViewTypeFolders() {
        return 0;
    }
    
    public final void setViewTypeFolders(int viewTypeFolders) {
    }
    
    public final int getViewTypeFiles() {
        return 0;
    }
    
    public final void setViewTypeFiles(int viewTypeFiles) {
    }
    
    public final boolean getShowExtendedDetails() {
        return false;
    }
    
    public final void setShowExtendedDetails(boolean showExtendedDetails) {
    }
    
    public final boolean getHideExtendedDetails() {
        return false;
    }
    
    public final void setHideExtendedDetails(boolean hideExtendedDetails) {
    }
    
    public final int getExtendedDetails() {
        return 0;
    }
    
    public final void setExtendedDetails(int extendedDetails) {
    }
    
    public final boolean getDoExtraCheck() {
        return false;
    }
    
    public final void setDoExtraCheck(boolean doExtraCheck) {
    }
    
    public final boolean getWasNewAppShown() {
        return false;
    }
    
    public final void setWasNewAppShown(boolean wasNewAppShown) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastFilepickerPath() {
        return null;
    }
    
    public final void setLastFilepickerPath(@org.jetbrains.annotations.NotNull()
    java.lang.String lastFilepickerPath) {
    }
    
    public final boolean getWasOTGHandled() {
        return false;
    }
    
    public final void setWasOTGHandled(boolean wasOTGHandled) {
    }
    
    public final boolean getTempSkipDeleteConfirmation() {
        return false;
    }
    
    public final void setTempSkipDeleteConfirmation(boolean tempSkipDeleteConfirmation) {
    }
    
    public final boolean getWereFavoritesPinned() {
        return false;
    }
    
    public final void setWereFavoritesPinned(boolean wereFavoritesPinned) {
    }
    
    public final boolean getWasRecycleBinPinned() {
        return false;
    }
    
    public final void setWasRecycleBinPinned(boolean wasRecycleBinPinned) {
    }
    
    public final boolean getWasSVGShowingHandled() {
        return false;
    }
    
    public final void setWasSVGShowingHandled(boolean wasSVGShowingHandled) {
    }
    
    public final int getGroupBy() {
        return 0;
    }
    
    public final void setGroupBy(int groupBy) {
    }
    
    public final boolean getUseRecycleBin() {
        return false;
    }
    
    public final void setUseRecycleBin(boolean useRecycleBin) {
    }
    
    public final boolean getBottomActions() {
        return false;
    }
    
    public final void setBottomActions(boolean bottomActions) {
    }
    
    public final int getVisibleBottomActions() {
        return 0;
    }
    
    public final void setVisibleBottomActions(int visibleBottomActions) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getEverShownFolders() {
        return null;
    }
    
    public final void setEverShownFolders(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> everShownFolders) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<java.lang.String> getEverShownFolders() {
        return null;
    }
    
    public final boolean getShowRecycleBinAtFolders() {
        return false;
    }
    
    public final void setShowRecycleBinAtFolders(boolean showRecycleBinAtFolders) {
    }
    
    public final boolean getAllowZoomingImages() {
        return false;
    }
    
    public final void setAllowZoomingImages(boolean allowZoomingImages) {
    }
    
    public Config(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/simplemobiletools/gallery/helpers/Config$Companion;", "", "()V", "newInstance", "Lcom/simplemobiletools/gallery/helpers/Config;", "context", "Landroid/content/Context;", "gallery_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.gallery.helpers.Config newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}