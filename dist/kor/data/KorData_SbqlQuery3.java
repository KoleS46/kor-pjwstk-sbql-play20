package kor.data;

import com.db4o.*;

import kor.model.Class;
import kor.model.Professor;
import kor.model.Student;
import kor.model.Student;

import org.apache.commons.collections.CollectionUtils;

import pl.wcislo.sbql4j.exception.*;
import pl.wcislo.sbql4j.java.model.compiletime.Signature.SCollectionType;
import pl.wcislo.sbql4j.java.model.runtime.*;
import pl.wcislo.sbql4j.java.model.runtime.Struct;
import pl.wcislo.sbql4j.java.model.runtime.factory.*;
import pl.wcislo.sbql4j.java.utils.ArrayUtils;
import pl.wcislo.sbql4j.java.utils.OperatorUtils;
import pl.wcislo.sbql4j.java.utils.Pair;
import pl.wcislo.sbql4j.lang.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.codegen.simple.*;
import pl.wcislo.sbql4j.lang.db4o.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.interpreter.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.parser.expression.*;
import pl.wcislo.sbql4j.lang.parser.expression.OrderByParamExpression.SortType;
import pl.wcislo.sbql4j.lang.parser.terminals.*;
import pl.wcislo.sbql4j.lang.parser.terminals.operators.*;
import pl.wcislo.sbql4j.lang.types.*;
import pl.wcislo.sbql4j.lang.xml.*;
import pl.wcislo.sbql4j.model.*;
import pl.wcislo.sbql4j.model.collections.*;
import pl.wcislo.sbql4j.util.*;
import pl.wcislo.sbql4j.util.Utils;
import pl.wcislo.sbql4j.xml.model.*;
import pl.wcislo.sbql4j.xml.parser.store.*;

import java.util.*;


public class KorData_SbqlQuery3 {
    private com.db4o.ObjectContainer db;

    public KorData_SbqlQuery3(final com.db4o.ObjectContainer db) {
        this.db = db;
    }

    /**
     * original query='db.( Student.(fname, sname, address.street, address.city, address.zip, promoter.fname , promoter.sname) )'
     *
     * query after optimization='db.Student.(getFname(), getSname(), getAddress().getStreet(), getAddress().getCity(), getAddress().getZip(), getPromoter().getFname(), getPromoter().getSname())'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        com.db4o.ObjectContainer _ident_db = db;
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _queryResult =
            _ident_db.query(new KorData_SbqlQuery3Db4o0());

        return _queryResult;
    }
}
