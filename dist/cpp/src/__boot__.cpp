#include <hxcpp.h>

#ifndef INCLUDED_haxe_io_Error
#include <haxe/io/Error.h>
#endif
#ifndef INCLUDED_sys_io_FileInput
#include <sys/io/FileInput.h>
#endif
#ifndef INCLUDED_sys_io_File
#include <sys/io/File.h>
#endif
#ifndef INCLUDED_Cyph
#include <Cyph.h>
#endif
#ifndef INCLUDED_haxe_io__UInt32Array_UInt32Array_Impl_
#include <haxe/io/_UInt32Array/UInt32Array_Impl_.h>
#endif
#ifndef INCLUDED_haxe_io_Eof
#include <haxe/io/Eof.h>
#endif
#ifndef INCLUDED_haxe_io_BytesInput
#include <haxe/io/BytesInput.h>
#endif
#ifndef INCLUDED_haxe_io_Input
#include <haxe/io/Input.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_io__ArrayBufferView_ArrayBufferView_Impl_
#include <haxe/io/_ArrayBufferView/ArrayBufferView_Impl_.h>
#endif
#ifndef INCLUDED_haxe_io_ArrayBufferViewImpl
#include <haxe/io/ArrayBufferViewImpl.h>
#endif
#ifndef INCLUDED_cpp_Lib
#include <cpp/Lib.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_SecureRandom
#include <SecureRandom.h>
#endif

void __files__boot();

void __boot_all()
{
__files__boot();
hx::RegisterResources( hx::GetResources() );
::haxe::io::Error_obj::__register();
::sys::io::FileInput_obj::__register();
::sys::io::File_obj::__register();
::Cyph_obj::__register();
::haxe::io::_UInt32Array::UInt32Array_Impl__obj::__register();
::haxe::io::Eof_obj::__register();
::haxe::io::BytesInput_obj::__register();
::haxe::io::Input_obj::__register();
::haxe::io::Bytes_obj::__register();
::haxe::io::_ArrayBufferView::ArrayBufferView_Impl__obj::__register();
::haxe::io::ArrayBufferViewImpl_obj::__register();
::cpp::Lib_obj::__register();
::Std_obj::__register();
::SecureRandom_obj::__register();
::haxe::io::Error_obj::__boot();
::Cyph_obj::__boot();
::sys::io::File_obj::__boot();
::sys::io::FileInput_obj::__boot();
}

