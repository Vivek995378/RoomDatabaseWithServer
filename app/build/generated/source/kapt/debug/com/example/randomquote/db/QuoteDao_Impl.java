package com.example.randomquote.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.randomquote.models.Result;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuoteDao_Impl implements QuoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Result> __insertionAdapterOfResult;

  public QuoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResult = new EntityInsertionAdapter<Result>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `quote` (`quoteId`,`_id`,`author`,`authorSlug`,`content`,`dateAdded`,`dateModified`,`length`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Result value) {
        stmt.bindLong(1, value.getQuoteId());
        if (value.get_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.get_id());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthor());
        }
        if (value.getAuthorSlug() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAuthorSlug());
        }
        if (value.getContent() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getContent());
        }
        if (value.getDateAdded() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDateAdded());
        }
        if (value.getDateModified() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDateModified());
        }
        stmt.bindLong(8, value.getLength());
      }
    };
  }

  @Override
  public Object addQuotes(final List<Result> quotes, final Continuation<Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfResult.insert(quotes);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getQuotes(final Continuation<? super List<Result>> continuation) {
    final String _sql = "SELECT * FROM quote";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Result>>() {
      @Override
      public List<Result> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfQuoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "quoteId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfAuthorSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "authorSlug");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "dateAdded");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "dateModified");
          final int _cursorIndexOfLength = CursorUtil.getColumnIndexOrThrow(_cursor, "length");
          final List<Result> _result = new ArrayList<Result>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Result _item;
            final int _tmpQuoteId;
            _tmpQuoteId = _cursor.getInt(_cursorIndexOfQuoteId);
            final String _tmp_id;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmp_id = null;
            } else {
              _tmp_id = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpAuthorSlug;
            if (_cursor.isNull(_cursorIndexOfAuthorSlug)) {
              _tmpAuthorSlug = null;
            } else {
              _tmpAuthorSlug = _cursor.getString(_cursorIndexOfAuthorSlug);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDateAdded;
            if (_cursor.isNull(_cursorIndexOfDateAdded)) {
              _tmpDateAdded = null;
            } else {
              _tmpDateAdded = _cursor.getString(_cursorIndexOfDateAdded);
            }
            final String _tmpDateModified;
            if (_cursor.isNull(_cursorIndexOfDateModified)) {
              _tmpDateModified = null;
            } else {
              _tmpDateModified = _cursor.getString(_cursorIndexOfDateModified);
            }
            final int _tmpLength;
            _tmpLength = _cursor.getInt(_cursorIndexOfLength);
            _item = new Result(_tmpQuoteId,_tmp_id,_tmpAuthor,_tmpAuthorSlug,_tmpContent,_tmpDateAdded,_tmpDateModified,_tmpLength);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
