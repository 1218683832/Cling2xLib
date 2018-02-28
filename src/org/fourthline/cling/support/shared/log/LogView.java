///*
// * Copyright (C) 2013 4th Line GmbH, Switzerland
// *
// * The contents of this file are subject to the terms of either the GNU
// * Lesser General Public License Version 2 or later ("LGPL") or the
// * Common Development and Distribution License Version 1 or later
// * ("CDDL") (collectively, the "License"). You may not use this file
// * except in compliance with the License. See LICENSE.txt for more
// * information.
// *
// * This program is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// */
//
//package org.fourthline.cling.support.shared.log;
//
//import org.seamless.swing.logging.LogCategory;
//import org.seamless.swing.logging.LogMessage;
//import org.fourthline.cling.support.shared.View;
//
//import java.util.List;
//
///**
// * @author Christian Bauer
// */
//public interface LogView extends View<LogView.Presenter> {
//
//    public interface Presenter {
//
//        void init();
//
//        void onExpand(LogMessage logMessage);
//
//        void pushMessage(LogMessage logMessage);
//    }
//
//    public interface LogCategories extends List<LogCategory> {
//    }
//
//    void pushMessage(LogMessage logMessage);
//
//    void dispose();
//}
