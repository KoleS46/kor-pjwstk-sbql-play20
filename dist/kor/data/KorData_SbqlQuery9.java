package kor.data;

import com.db4o.*;

import kor.model.Class;
import kor.model.Professor;
import kor.model.Professor;
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


public class KorData_SbqlQuery9 {
    private com.db4o.ObjectContainer db;

    public KorData_SbqlQuery9(final com.db4o.ObjectContainer db) {
        this.db = db;
    }

    /**
     * original query='db.( (Professor as p where p.married != not true).(p.fname, p.sname, p.married) )'
     *
     * query after optimization='((!true) group as _aux0).db.(Professor as p where p.getMarried() != _aux0).(p.getFname(), p.getSname(), p.getMarried())'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        java.lang.Boolean _notResult = !true;
        java.lang.Boolean _groupAsResult_aux0 = _notResult;
        java.lang.Boolean _dotEl6 = _groupAsResult_aux0;
        com.db4o.ObjectContainer _ident_db = db;
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult5 =
            _ident_db.query(new KorData_SbqlQuery9Db4o0(_groupAsResult_aux0));

        return _dotResult5;
    }
}
