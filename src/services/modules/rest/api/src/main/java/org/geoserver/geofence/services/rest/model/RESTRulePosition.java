/* (c) 2015 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.geofence.services.rest.model;

import javax.xml.bind.annotation.XmlAttribute;

public class RESTRulePosition {
    private RESTRulePosition.RulePosition position;
    private long value;

    public RESTRulePosition() {
    }

    public RESTRulePosition(RESTRulePosition.RulePosition position, long value) {
        this.position = position;
        this.value = value;
    }

    @XmlAttribute
    public RESTRulePosition.RulePosition getPosition() {
        return this.position;
    }

    public void setPosition(RESTRulePosition.RulePosition position) {
        this.position = position;
    }

    @XmlAttribute
    public long getValue() {
        return this.value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public static enum RulePosition {
        fixedPriority,
        offsetFromTop,
        offsetFromBottom;

        private RulePosition() {
        }

    }
}
