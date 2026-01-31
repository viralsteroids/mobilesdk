# open_memory2 callsite 0x0095f658 (decoded)

Decoded window around `0x0095f658` (see `analysis/open_memory2_callsite_0095f658.txt`) shows the BL target is **not** `archive_read_open_memory2`; it resolves to `Image::GetImagePageName(const char*, int)` at `0x027651d0` per `analysis/plt_symbol_map_v2.txt`.

Key excerpt (simplified):
- `X19 = X2` (saved arg2)
- `X20 = X0` (saved arg0)
- If `W2 != 0`: calls a vtable method at `[X0]->+0x548` with `(X0, X1=X19, X2=NULL)`, result in `X21`.
- Else `X21 = 0`.
- `BL 0x027651d0` with `X0 = X21` at `0x0095f658`.
- If `X21 != 0`: calls vtable method at `[X0]->+0x550` with `(X0, X1=X19, X2=X21)` and returns W0.

Implication: `0x0095f658` is a **different** callsite previously mis-attributed to `archive_read_open_memory2` in older scans; it is a member method on an Image-like object and unrelated to bundle archive open. The real `archive_read_open_memory2` callsite is `0x02557c60`.
